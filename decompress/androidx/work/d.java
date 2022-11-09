// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

public final class d extends f
{
    public d(final a a) {
        super(a.b, a.c, a.d);
    }
    
    public static final class a extends f$a<a, d>
    {
        public a(final Class<? extends ListenableWorker> clazz) {
            super((Class)clazz);
            super.c.d = OverwritingInputMerger.class.getName();
        }
        
        public final f c() {
            if (super.a && super.c.j.c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new d(this);
        }
        
        public final f$a d() {
            return this;
        }
    }
}
