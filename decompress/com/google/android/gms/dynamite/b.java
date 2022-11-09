// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.dynamite;

import android.content.Context;

public final class b implements DynamiteModule$a
{
    public final DynamiteModule$a$b a(final Context context, final String s, final DynamiteModule$a$a dynamiteModule$a$a) throws DynamiteModule$LoadingException {
        final DynamiteModule$a$b dynamiteModule$a$b = new DynamiteModule$a$b();
        final int a = dynamiteModule$a$a.a(context, s, true);
        dynamiteModule$a$b.b = a;
        if (a != 0) {
            dynamiteModule$a$b.c = 1;
        }
        else if ((dynamiteModule$a$b.a = dynamiteModule$a$a.b(context, s)) != 0) {
            dynamiteModule$a$b.c = -1;
        }
        return dynamiteModule$a$b;
    }
}
