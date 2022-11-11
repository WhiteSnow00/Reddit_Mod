// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class CrowdControl
{
    public static final a<CrowdControl, CrowdControl.CrowdControl$Builder> ADAPTER;
    public final List<String> collapse_reasons;
    public final String rating_threshold;
    
    static {
        ADAPTER = (a)new CrowdControl.CrowdControl$CrowdControlAdapter((CrowdControl$1)null);
    }
    
    private CrowdControl(final CrowdControl.CrowdControl$Builder crowdControl$Builder) {
        List<String> unmodifiableList;
        if (CrowdControl.CrowdControl$Builder.access$100(crowdControl$Builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)CrowdControl.CrowdControl$Builder.access$100(crowdControl$Builder));
        }
        this.collapse_reasons = unmodifiableList;
        this.rating_threshold = CrowdControl.CrowdControl$Builder.access$200(crowdControl$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof CrowdControl)) {
            return false;
        }
        final CrowdControl crowdControl = (CrowdControl)o;
        final List<String> collapse_reasons = this.collapse_reasons;
        final List<String> collapse_reasons2 = crowdControl.collapse_reasons;
        if (collapse_reasons == collapse_reasons2 || (collapse_reasons != null && collapse_reasons.equals(collapse_reasons2))) {
            final String rating_threshold = this.rating_threshold;
            final String rating_threshold2 = crowdControl.rating_threshold;
            boolean b2 = b;
            if (rating_threshold == rating_threshold2) {
                return b2;
            }
            if (rating_threshold != null && rating_threshold.equals(rating_threshold2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final List<String> collapse_reasons = this.collapse_reasons;
        int hashCode = 0;
        int hashCode2;
        if (collapse_reasons == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = collapse_reasons.hashCode();
        }
        final String rating_threshold = this.rating_threshold;
        if (rating_threshold != null) {
            hashCode = rating_threshold.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CrowdControl{collapse_reasons=");
        k.append(this.collapse_reasons);
        k.append(", rating_threshold=");
        return b.j(k, this.rating_threshold, "}");
    }
    
    public void write(final e e) throws IOException {
        CrowdControl.ADAPTER.write(e, (Object)this);
    }
}
