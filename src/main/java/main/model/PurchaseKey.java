package main.model;

import java.io.Serializable;

public class PurchaseKey implements Serializable {
    private int cardId;

    private int playerId;

    public PurchaseKey(int cardId, int playerId){
        this.cardId = cardId;
        this.playerId = playerId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public boolean equals(PurchaseKey purchaseKey){
        return this.cardId == purchaseKey.getCardId() &&
                this.playerId == purchaseKey.getPlayerId();
    }
}
