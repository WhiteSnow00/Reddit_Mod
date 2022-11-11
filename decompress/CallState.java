// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal;

enum CallState
{
    ACTIVE, 
    CANCELED, 
    IDLE, 
    TERMINATED;
    
    public static final class a
    {
        public final CallState a;
        
        public a(final CallState a) {
            this.a = a;
        }
        
        public final String a(final CallState... array) {
            final StringBuilder k = a.k("Found: ");
            k.append(this.a.name());
            k.append(", but expected [");
            final StringBuilder sb = new StringBuilder(k.toString());
            final int length = array.length;
            String s = "";
            for (int i = 0; i < length; ++i, s = ", ") {
                final CallState callState = array[i];
                sb.append(s);
                sb.append(callState.name());
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
