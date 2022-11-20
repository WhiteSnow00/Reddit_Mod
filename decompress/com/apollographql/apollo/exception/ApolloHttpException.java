// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.exception;

import okhttp3.Response;

public final class ApolloHttpException extends ApolloException
{
    private final int code;
    public final transient Response f;
    private final String message;
    
    public ApolloHttpException(final Response f) {
        String string;
        if (f == null) {
            string = "Empty HTTP response";
        }
        else {
            final StringBuilder t = a.t("HTTP ");
            t.append(f.code());
            t.append(" ");
            t.append(f.message());
            string = t.toString();
        }
        super(string);
        int code;
        if (f != null) {
            code = f.code();
        }
        else {
            code = 0;
        }
        this.code = code;
        String message;
        if (f != null) {
            message = f.message();
        }
        else {
            message = "";
        }
        this.message = message;
        this.f = f;
    }
    
    public int code() {
        return this.code;
    }
    
    public String message() {
        return this.message;
    }
    
    public Response rawResponse() {
        return this.f;
    }
}
