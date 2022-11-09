// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import java.util.List;
import com.google.gson.a.c;

public final class BadgeText
{
    @c(LIZ = "key")
    public String LIZ;
    @c(LIZ = "default_pattern")
    public String LIZIZ;
    @c(LIZ = "pieces")
    public List<String> LIZJ;
    
    static {
        Covode.recordClassIndex(4964);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", key=");
            sb.append(this.LIZ);
        }
        if (this.LIZIZ != null) {
            sb.append(", default_pattern=");
            sb.append(this.LIZIZ);
        }
        final List<String> lizj = this.LIZJ;
        if (lizj != null && !lizj.isEmpty()) {
            sb.append(", pieces=");
            sb.append(this.LIZJ);
        }
        sb.replace(0, 2, "BadgeText{");
        sb.append('}');
        return sb.toString();
    }
}
