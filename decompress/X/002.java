// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils$StringSplitter;
import java.util.List;
import java.util.Iterator;
import java.util.HashSet;
import android.text.TextUtils$SimpleStringSplitter;
import android.ss.com.vboost.CapabilityType;
import java.util.Set;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public class 002
{
    public final LinkedHashMap<String, String> LIZ;
    
    static {
        Covode.recordClassIndex(12);
    }
    
    public 002() {
        this.LIZ = new LinkedHashMap<String, String>(64);
    }
    
    private void LIZ(final String s, final String s2) {
        if (s.indexOf(61) != -1 || s.indexOf(59) != -1 || s.indexOf(0) != -1) {
            00s.LIZ(6);
            return;
        }
        if (s2.indexOf(61) != -1 || s2.indexOf(59) != -1 || s2.indexOf(0) != -1) {
            00s.LIZ(6);
            return;
        }
        this.LIZIZ(s, s2);
    }
    
    private void LIZIZ(final String s, final String s2) {
        this.LIZ.remove(s);
        this.LIZ.put(s, s2);
    }
    
    public final Set<CapabilityType> LIZ() {
        final String string = this.LIZ.get("support_capability_set");
        if (string == null) {
            return null;
        }
        final TextUtils$SimpleStringSplitter textUtils$SimpleStringSplitter = new TextUtils$SimpleStringSplitter(',');
        ((TextUtils$StringSplitter)textUtils$SimpleStringSplitter).setString(string);
        final HashSet set = new HashSet();
        final Iterator iterator = ((TextUtils$StringSplitter)textUtils$SimpleStringSplitter).iterator();
        while (iterator.hasNext()) {
            set.add(CapabilityType.valueOf(Integer.parseInt((String)iterator.next())));
        }
        if (set.size() == 0) {
            return null;
        }
        return set;
    }
    
    public final void LIZ(final 003 003) {
        this.LIZIZ("cpu_core_limit_by", Integer.toString(003.ordinal()));
    }
    
    public final void LIZ(final 005 005) {
        final StringBuilder sb = new StringBuilder();
        sb.append(005.LIZ);
        sb.append(",");
        sb.append(005.LIZIZ);
        sb.append(",");
        sb.append(005.LIZJ);
        this.LIZ("task_priority_limit_rule", sb.toString());
    }
    
    public final void LIZ(final CapabilityType capabilityType, final List<004> list) {
        final StringBuilder sb = new StringBuilder();
        sb.append(capabilityType.getName());
        sb.append("_limit_rule");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            final 004 004 = list.get(i);
            sb2.append("(");
            final boolean liz = 004.LIZ;
            final String s = "1";
            String s2;
            if (liz) {
                s2 = "1";
            }
            else {
                s2 = "0";
            }
            sb2.append(s2);
            sb2.append(":");
            sb2.append(004.LIZIZ);
            sb2.append(":");
            sb2.append(004.LIZJ);
            sb2.append(",");
            String s3;
            if (004.LIZLLL) {
                s3 = "1";
            }
            else {
                s3 = "0";
            }
            sb2.append(s3);
            sb2.append(":");
            sb2.append(004.LJ);
            sb2.append(",");
            String s4;
            if (004.LJFF) {
                s4 = s;
            }
            else {
                s4 = "0";
            }
            sb2.append(s4);
            sb2.append(":");
            sb2.append(004.LJI);
            sb2.append(")");
            if (i != list.size() - 1) {
                sb2.append(',');
            }
        }
        this.LIZ(string, sb2.toString());
    }
    
    public final void LIZ(final Set<CapabilityType> set) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<CapabilityType> iterator = set.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().getIndex());
            if (iterator.hasNext()) {
                sb.append(",");
            }
        }
        this.LIZ("support_capability_set", sb.toString());
    }
}
