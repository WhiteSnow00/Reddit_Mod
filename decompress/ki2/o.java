// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import aq2.a;
import xh2.e;
import yh2.b;

public final class o<T>
{
    public final T a;
    public final T b;
    public final String c;
    public final b d;
    
    public o(final e a, final e b, final String c, final b d) {
        ng2.e.f((Object)c, "filePath");
        ng2.e.f((Object)d, "classId");
        this.a = (T)a;
        this.b = (T)b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof o)) {
            return false;
        }
        final o o2 = (o)o;
        return ng2.e.a((Object)this.a, (Object)o2.a) && ng2.e.a((Object)this.b, (Object)o2.b) && ng2.e.a((Object)this.c, (Object)o2.c) && ng2.e.a((Object)this.d, (Object)o2.d);
    }
    
    @Override
    public final int hashCode() {
        final T a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final T b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return this.d.hashCode() + aq2.a.e(this.c, (hashCode2 * 31 + hashCode) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("IncompatibleVersionErrorData(actualVersion=");
        t.append(this.a);
        t.append(", expectedVersion=");
        t.append(this.b);
        t.append(", filePath=");
        t.append(this.c);
        t.append(", classId=");
        t.append(this.d);
        t.append(')');
        return t.toString();
    }
}
