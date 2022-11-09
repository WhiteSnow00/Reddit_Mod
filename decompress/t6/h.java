// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import ah2.f;
import d7.a;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

public final class h
{
    public final List a = a;
    public final List b = b;
    public final List c = c;
    
    public h(final List c) {
        this.c = c;
        this.a = new ArrayList(c.size());
        this.b = new ArrayList(c.size());
        for (int i = 0; i < c.size(); ++i) {
            this.a.add(new m((List<a<y6.h>>)((Mask)c.get(i)).b.g));
            this.b.add(((Mask)c.get(i)).c.b());
        }
    }
}
