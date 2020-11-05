package main.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Purchase {
    @EmbeddedId
    private PurchaseKey purchaseKey;

    public PurchaseKey getPurchaseKey() {
        return purchaseKey;
    }

    public void setPurchaseKey(PurchaseKey purchaseKey) {
        this.purchaseKey = purchaseKey;
    }
}
