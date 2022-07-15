import java.io.*;

class Bank {
	String name;
	String acc_no;
	char type;
	int balance;
	int overdraft;

	Bank(String name, String acc_no, char type, int balance) {
		this.name = name;
		this.acc_no = acc_no;
		this.type = type;
		this.balance = balance;
		this.overdraft = 0;
	}

	void withdraw(int amount) {
		if (type == 'S') {

			if (balance - amount <= 1000) {
				System.out.println("THIS IS NOT ALLOWED");
			} else {
				balance = balance - amount;
			}
		}

		else {
			if (balance < 0) {
				System.out.println("Unable To Withdraw");
				System.out.println("Overdraft is" + overdraft);

			} else {
				balance = balance - amount;
				if (balance < 0) {
					overdraft = -balance;
				}
			}
		}
	}

	void deposite(int amount) {
		balance += amount;
	}

	int checkBalance() {
		return balance;
	}
}

class BankAccount {
	public static void main(String agrs[]) throws IOException {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		while (1==1) {
			System.out.println("ENTER USER DATA\nENTER 0 FOR CONTINUE AND 1 FOR EXIT");
			int n = Integer.parseInt(sc.readLine());
			if (n == 1) {
				break;
			} else if (n != 0) {
				System.out.println("WRONG INPUT");
				continue;
			}
			System.out.println("ENTER ACCOUNT TYPE :");
			char type = (char)sc.read();
			System.out.println("ENTER ACCOUNT HOLDER NAME:");
			String name = sc.readLine();
			System.out.println("ENTER ACCOUNT HOLDER ACCOUNT NUMBER:");
			String acc_no = sc.readLine();
			System.out.println("ENTER ACCOUNT HOLDER ACCOUNT BALANCE:");
			int balance = Integer.parseInt(sc.readLine());
			Bank b = new Bank(name, acc_no, type, balance);
			System.out.println("NAME OF THE ACCOUNT HOLDER IS:" + b.name);
			if (b.type == 'S') {
				System.out.println("ACCOUNT TYPE IS SAVINGS");
			} else {
				System.out.println("ACCOUNT TYPE IS CURRENT");
			}
			System.out.println("ACCOUNT Number IS" + b.acc_no);
			while (1==1) {

				System.out.println("ACCOUNT BALANCE IS" + b.balance);
				System.out.println("ACCOUNT OVERDRAFT IS" + b.overdraft);
				System.out.println("PRESS 2 FOR CONTINUE WITH THE CURRENT USER AND 3 FOR NEW USER");
				int m = Integer.parseInt(sc.readLine());
				if (m == 3) {
					break;
				}
				if (m != 2) {
					System.out.println("WRONG INPUT");
					continue;
				}
				System.out.println("PRESS 4 FOR WITHDRAW\nPRESS 5 FOR DEPOSITE\nPRESS 6 FOR CHECKBALANCE");
				int k = Integer.parseInt(sc.readLine());
				if (k == 4) {
					System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
					int amt = Integer.parseInt(sc.readLine());
					b.withdraw(amt);
				} else if (k == 5) {
					System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSITE");
					int amt = Integer.parseInt(sc.readLine());
					b.deposite(amt);
				} else if (k == 6) {
					System.out.println("BALANCE IS" + b.checkBalance());
				} else {
					System.out.println("WRONG INPUT");
				}

			}

		}

	}
}
