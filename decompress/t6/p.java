// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import d7.c;
import d7.a;
import java.util.List;
import com.airbnb.lottie.model.DocumentData;

public final class p extends g<DocumentData>
{
    public p(final List<a<DocumentData>> list) {
        super((List)list);
    }
    
    public final Object g(final a a, final float n) {
        final c<A> e = ((t6.a)this).e;
        DocumentData documentData3;
        if (e != null) {
            final float g = a.g;
            final Float h = a.h;
            float floatValue;
            if (h == null) {
                floatValue = Float.MAX_VALUE;
            }
            else {
                floatValue = h;
            }
            final DocumentData documentData = (DocumentData)a.b;
            final T c = a.c;
            DocumentData documentData2;
            if (c == null) {
                documentData2 = documentData;
            }
            else {
                documentData2 = (DocumentData)c;
            }
            documentData3 = (DocumentData)e.b(g, floatValue, (A)documentData, (A)documentData2, n, ((t6.a)this).d(), ((t6.a)this).d);
        }
        else {
            if (n == 1.0f) {
                final T c2 = a.c;
                if (c2 != null) {
                    documentData3 = (DocumentData)c2;
                    return documentData3;
                }
            }
            documentData3 = (DocumentData)a.b;
        }
        return documentData3;
    }
}
