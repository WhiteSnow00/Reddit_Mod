// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class HostMultiGuestPermissionResponse
{
    @c(LIZ = "data")
    public ResponseData LIZ;
    
    static {
        Covode.recordClassIndex(9778);
    }
    
    public static final class ResponseData
    {
        @c(LIZ = "permission_info")
        public MultiGuestPermissionInfo LIZ;
        
        static {
            Covode.recordClassIndex(9779);
        }
        
        public ResponseData() {
            this.LIZ = null;
        }
        
        public ResponseData(final char c) {
            this((byte)0);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof ResponseData && n.LIZ((Object)this.LIZ, (Object)((ResponseData)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            final MultiGuestPermissionInfo liz = this.LIZ;
            if (liz != null) {
                return liz.hashCode();
            }
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("ResponseData(permissionInfo=");
            sb.append(this.LIZ);
            sb.append(")");
            return sb.toString();
        }
    }
}
