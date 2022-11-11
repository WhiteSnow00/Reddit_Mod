// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

public class StringBuilderWriter extends Writer implements Serializable
{
    private static final long serialVersionUID = -146927496096066153L;
    private final StringBuilder builder;
    
    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }
    
    public StringBuilderWriter(final int n) {
        this.builder = new StringBuilder(n);
    }
    
    public StringBuilderWriter(StringBuilder builder) {
        if (builder == null) {
            builder = new StringBuilder();
        }
        this.builder = builder;
    }
    
    @Override
    public Writer append(final char c) {
        this.builder.append(c);
        return this;
    }
    
    @Override
    public Writer append(final CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }
    
    @Override
    public Writer append(final CharSequence charSequence, final int n, final int n2) {
        this.builder.append(charSequence, n, n2);
        return this;
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void flush() {
    }
    
    public StringBuilder getBuilder() {
        return this.builder;
    }
    
    @Override
    public String toString() {
        return this.builder.toString();
    }
    
    @Override
    public void write(final String s) {
        if (s != null) {
            this.builder.append(s);
        }
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        if (array != null) {
            this.builder.append(array, n, n2);
        }
    }
}
