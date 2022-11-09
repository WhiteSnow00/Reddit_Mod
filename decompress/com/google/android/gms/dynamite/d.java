// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class d implements DynamiteModule$a
{
    public final DynamiteModule$a$b a(final Context context, final String s, final DynamiteModule$a$a dynamiteModule$a$a) throws DynamiteModule$LoadingException {
        final DynamiteModule$a$b dynamiteModule$a$b = new DynamiteModule$a$b();
        final int b = dynamiteModule$a$a.b(context, s);
        dynamiteModule$a$b.a = b;
        int n = 0;
        int n2;
        if (b != 0) {
            n2 = dynamiteModule$a$a.a(context, s, false);
            dynamiteModule$a$b.b = n2;
        }
        else {
            n2 = dynamiteModule$a$a.a(context, s, true);
            dynamiteModule$a$b.b = n2;
        }
        final int a = dynamiteModule$a$b.a;
        if (a == 0) {
            if (n2 == 0) {
                dynamiteModule$a$b.c = 0;
                return dynamiteModule$a$b;
            }
        }
        else {
            n = a;
        }
        if (n >= n2) {
            dynamiteModule$a$b.c = -1;
        }
        else {
            dynamiteModule$a$b.c = 1;
        }
        return dynamiteModule$a$b;
    }
}
