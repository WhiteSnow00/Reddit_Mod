// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.okhttp3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import al0.b;

public enum TlsVersion
{
    SSL_3_0("SSLv3"), 
    TLS_1_0("TLSv1"), 
    TLS_1_1("TLSv1.1"), 
    TLS_1_2("TLSv1.2"), 
    TLS_1_3("TLSv1.3");
    
    public final String javaName;
    
    private TlsVersion(final String javaName) {
        this.javaName = javaName;
    }
    
    public static TlsVersion forJavaName(final String s) {
        s.getClass();
        s.hashCode();
        int n = -1;
        switch (s) {
            case "TLSv1": {
                n = 4;
                break;
            }
            case "SSLv3": {
                n = 3;
                break;
            }
            case "TLSv1.3": {
                n = 2;
                break;
            }
            case "TLSv1.2": {
                n = 1;
                break;
            }
            case "TLSv1.1": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException(b.h("Unexpected TLS version: ", s));
            }
            case 4: {
                return TlsVersion.TLS_1_0;
            }
            case 3: {
                return TlsVersion.SSL_3_0;
            }
            case 2: {
                return TlsVersion.TLS_1_3;
            }
            case 1: {
                return TlsVersion.TLS_1_2;
            }
            case 0: {
                return TlsVersion.TLS_1_1;
            }
        }
    }
    
    public static List<TlsVersion> forJavaNames(final String... array) {
        final ArrayList list = new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(forJavaName(array[i]));
        }
        return (List<TlsVersion>)Collections.unmodifiableList((List<?>)list);
    }
    
    public String javaName() {
        return this.javaName;
    }
}
