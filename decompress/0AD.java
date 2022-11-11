// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0ad
{
    @c(LIZ = "scene")
    public String LIZ;
    @c(LIZ = "user_id")
    public String LIZIZ;
    @c(LIZ = "device_id")
    public String LIZJ;
    @c(LIZ = "os_version")
    public String LIZLLL;
    @c(LIZ = "device_type")
    public String LJ;
    @c(LIZ = "network")
    public String LJFF;
    @c(LIZ = "sign")
    public String LJI;
    
    static {
        Covode.recordClassIndex(5539);
    }
    
    public 0ad() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = "";
        this.LJI = "";
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("InitData(scene='");
        sb.append(this.LIZ);
        sb.append("', userId=");
        sb.append(this.LIZIZ);
        sb.append(", deviceId=");
        sb.append(this.LIZJ);
        sb.append(", osVersion=");
        sb.append(this.LIZLLL);
        sb.append(", deviceType=");
        sb.append(this.LJ);
        sb.append(", network=");
        sb.append(this.LJFF);
        sb.append(", sign=");
        sb.append(this.LJI);
        sb.append(')');
        return sb.toString();
    }
}
