package _05_vault;

public class Vault_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vault vault = new Vault();
	JamesBond bond = new JamesBond();
	System.out.println("Bond has cracked the case! The vault has been opened! The code was " + bond.findCode(vault) + "!");
	}

}
