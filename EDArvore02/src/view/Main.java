package view;

import model.matheus.libArvoreInt.Arvore;

public class Main {

	public static void main(String[] args) 
	{
		
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		Arvore arvore = new Arvore();
		
		for (int i : vetor)
			arvore.insert(i);
		
		try {
			arvore.prefixSearch();
			System.out.println();
			arvore.infixSearch();
			System.out.println();
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
