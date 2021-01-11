package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	
	public Vault () {
	code = ran.nextInt(1000000);
	}
	Random ran = new Random();
	int code;
	public boolean tryCode(int vaultCode) {
		
		
		if (code == vaultCode) {
			return true;
		}
		else {
			return false;
		}
	}	
}
class JamesBond {
	public int findCode(Vault vault) {
		for (int i = 0;  i < 1000000; i++) {
			if (vault.tryCode(i)){
				return i;
			}
		}
		return -1;
	}
}