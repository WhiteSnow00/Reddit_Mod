// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.repository;

import kotlin.Metadata;
import ng2.e;

public final class NsfwSetting
{
    public final Type a;
    public final boolean b;
    
    public NsfwSetting(final Type a, final boolean b) {
        e.f((Object)a, "type");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NsfwSetting)) {
            return false;
        }
        final NsfwSetting nsfwSetting = (NsfwSetting)o;
        return this.a == nsfwSetting.a && this.b == nsfwSetting.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("NsfwSetting(type=");
        t.append(this.a);
        t.append(", enabled=");
        return d.n(t, this.b, ')');
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/repository/NsfwSetting$Type;", "", "(Ljava/lang/String;I)V", "OVER_18", "BLUR", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Type
    {
        private static final Type[] $VALUES;
        
        BLUR, 
        OVER_18;
        
        private static final Type[] $values() {
            return new Type[] { Type.OVER_18, Type.BLUR };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
