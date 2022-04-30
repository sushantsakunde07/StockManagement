package com.stocksmanagement;
public class Stock {
    String shareName;
    Float sharePrice;
    Integer numberOfShares;
    Float valueOfShare;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public Float getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Float sharePrice) {
        this.sharePrice = sharePrice;
    }

    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(Integer numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public Float getValueOfShare() {
        return valueOfShare;
    }

    public void setValueOfShare(Float valueOfShare) {
        this.valueOfShare = valueOfShare;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", sharePrice=" + sharePrice +
                ", numberOfShares=" + numberOfShares +
                ", valueOfShare=" + valueOfShare +
                '}';
    }
}