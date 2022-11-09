// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import java.util.HashMap;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

public final class y extends b
{
    public final long a;
    public final Map<String, AssetPackState> b;
    
    public y(final long a, final HashMap b) {
        this.a = a;
        this.b = b;
    }
    
    public final Map<String, AssetPackState> a() {
        return this.b;
    }
    
    public final long b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof b) {
            final b b = (b)o;
            if (this.a == b.b() && this.b.equals(b.a())) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final long a = this.a;
        return ((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final long a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(value.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(a);
        sb.append(", packStates=");
        return a2.b.j(sb, value, "}");
    }
}
