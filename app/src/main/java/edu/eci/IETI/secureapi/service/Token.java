package edu.eci.IETI.secureapi.service;

public class Token {

    private String tokenId = "Log_in";

    public Token(){

    }

    public Token(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
