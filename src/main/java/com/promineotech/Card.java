package com.promineotech;

/**
 * Represents a standard playing card.
 */
public class Card {
  private Suit suit;
  private String face;
  
  /**
   * Creates an instance of the Card class.
   * @param suit The suit for the card (diamond, spade, heart, club).
   * @param face The face value for the card. (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
   */
  public Card(Suit suit, String face) {
    this.suit = suit;
    this.face = face;
    
    // TODO initialize card values
  }
  
  /**
   * Gets the face value for the card.
   * @return
   */
  public String getFace() {
    return face;
  }
  
  /**
   * Gets the suit for the card 
   * @return The suit for the card
   */
  public Suit getSuit() {
    return suit;
  }
  
  /**
   * Retrieves the numeric value of the card.
   * @return The numeric value.
   */
  public int getValue() {
    // TODO Convert the face value of the card to a numeric value.
    throw new UnsupportedOperationException("Not implemented");
  }
  
  /**
   * Returns the detailed description of the card.
   * @return The description.
   */
  public String describe() {
    // TODO Display card as "Ace of Diamonds"
    throw new UnsupportedOperationException("Not implemented");
  }
  
  /**
   * Returns the default string representation of the card.
   * @return The string representation.
   */
  @Override
  public String toString() {
    // TODO Display Ace of Diamonds as ♥A
    throw new UnsupportedOperationException("Not implemented");
  }
}
