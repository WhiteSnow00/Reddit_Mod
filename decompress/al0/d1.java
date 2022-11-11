// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.AvatarAssetSlot;
import com.apollographql.apollo.api.ResponseField;

public final class d1
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final Object c;
    public final AvatarAssetSlot d;
    public final int e;
    
    static {
        f = new ResponseField[] { ResponseField$b.i((Map)null, "__typename", false, "__typename"), (ResponseField)ResponseField$b.b((o)CustomType.ID, "accessoryId", "accessoryId", (Map)null, false), (ResponseField)ResponseField$b.b((o)CustomType.URL, "imageUrl", "imageUrl", (Map)null, false), ResponseField$b.d("slot", false, "slot"), ResponseField$b.f((Map)null, "slotNumber", false, "slotNumber") };
    }
    
    public d1(final String a, final String b, final Object c, final AvatarAssetSlot d, final int e) {
        sg2.e.f((Object)d, "slot");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d1)) {
            return false;
        }
        final d1 d1 = (d1)o;
        return sg2.e.a((Object)this.a, (Object)d1.a) && sg2.e.a((Object)this.b, (Object)d1.b) && sg2.e.a(this.c, d1.c) && this.d == d1.d && this.e == d1.e;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() + a81.e.g(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AvatarAssetFragment(__typename=");
        r.append(this.a);
        r.append(", accessoryId=");
        r.append(this.b);
        r.append(", imageUrl=");
        r.append(this.c);
        r.append(", slot=");
        r.append(this.d);
        r.append(", slotNumber=");
        return d.l(r, this.e, ')');
    }
}
