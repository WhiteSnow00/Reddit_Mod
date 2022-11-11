// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api.internal.json;

import kotlin.Metadata;
import k7.a;
import java.io.IOException;
import java.io.Closeable;

public interface JsonReader extends Closeable
{
    String G1() throws IOException;
    
    a J1() throws IOException;
    
    boolean O1() throws IOException;
    
    String Q1() throws IOException;
    
    a W1() throws IOException;
    
    boolean hasNext() throws IOException;
    
    a l1() throws IOException;
    
    a m1() throws IOException;
    
    long nextLong() throws IOException;
    
    Token peek() throws IOException;
    
    void w1() throws IOException;
    
    void z1() throws IOException;
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "Lcom/apollographql/apollo/api/internal/json/JsonReader$Token;", "", "(Ljava/lang/String;I)V", "BEGIN_ARRAY", "END_ARRAY", "BEGIN_OBJECT", "END_OBJECT", "NAME", "STRING", "NUMBER", "LONG", "BOOLEAN", "NULL", "END_DOCUMENT", "apollo-api" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
    public enum Token
    {
        BEGIN_ARRAY, 
        BEGIN_OBJECT, 
        BOOLEAN, 
        END_ARRAY, 
        END_DOCUMENT, 
        END_OBJECT, 
        LONG, 
        NAME, 
        NULL, 
        NUMBER, 
        STRING;
    }
}
