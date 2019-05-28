package com.bae.blackjack.mainapp;


public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int play(int player, int dealer) {
		
		
		int dealerScore = dealer;
		
		// If dealer < 16, must add a new card (twist)
		while (dealerScore < 16 && dealerScore !=21) {
			
			int newCard = twist();
			
			if (newCard == 11 && (dealerScore + newCard > 21)) {
				newCard = 1;
			}
			
			dealerScore = dealerScore + twist();
			System.out.println(dealerScore);
		}
		
		
		
		if (player == 1 || player == 2 || dealer == 1 || dealer == 2) {
			return -1;
		}
		
		else if(player > dealer && player <=21) {
			return player;
		}
		
		else if (dealer > player && dealer <=21) {
			return dealer;
		}
		
		else if (player > 30 || dealer > 30) {
			return -1;
		}
		
	
		else if(player > dealer && dealer <=21) {
			return dealer;
		}
		
		else if (player > 21  &&  dealer > 21) {
			return 0;
		}
			
		
		else {
			return player;
		}
	}
	
	public int twist() {
		int rand_int = ((int)(Math.random()*11)+1);
		//System.out.println(rand_int);
		return rand_int;
		
	}
	
}
