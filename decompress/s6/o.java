// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import com.airbnb.lottie.model.DocumentData$Justification;
import c7.b;
import com.airbnb.lottie.model.DocumentData;
import c7.c;

public final class o extends c<DocumentData>
{
    public final b c;
    public final c d;
    public final DocumentData e;
    
    public o(final b c, final c d, final DocumentData e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a(final b b) {
        final b c = this.c;
        final float a = b.a;
        final float b2 = b.b;
        final String a2 = ((DocumentData)b.c).a;
        final String a3 = ((DocumentData)b.d).a;
        final float e = b.e;
        final float f = b.f;
        final float g = b.g;
        c.a = a;
        c.b = b2;
        c.c = (T)a2;
        c.d = (T)a3;
        c.e = e;
        c.f = f;
        c.g = g;
        final String a4 = this.d.a(c);
        T t;
        if (b.f == 1.0f) {
            t = b.d;
        }
        else {
            t = b.c;
        }
        final DocumentData documentData = (DocumentData)t;
        final DocumentData e2 = this.e;
        final String b3 = documentData.b;
        final float c2 = documentData.c;
        final DocumentData$Justification d = documentData.d;
        final int e3 = documentData.e;
        final float f2 = documentData.f;
        final float g2 = documentData.g;
        final int h = documentData.h;
        final int i = documentData.i;
        final float j = documentData.j;
        final boolean k = documentData.k;
        e2.a = a4;
        e2.b = b3;
        e2.c = c2;
        e2.d = d;
        e2.e = e3;
        e2.f = f2;
        e2.g = g2;
        e2.h = h;
        e2.i = i;
        e2.j = j;
        e2.k = k;
        return e2;
    }
}
