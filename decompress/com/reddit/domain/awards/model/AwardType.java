// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import cj2.j;
import java.util.Locale;
import ka0.c;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/awards/model/AwardType;", "", "", "toString", "apiType", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "MODERATOR", "COMMUNITY", "GLOBAL", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum AwardType
{
    private static final String AWARD_TYPE_COMMUNITY = "community";
    private static final String AWARD_TYPE_GLOBAL = "global";
    private static final String AWARD_TYPE_MOD = "moderator";
    private static final String AWARD_TYPE_UNKNOWN = "gid_unknown";
    
    @n(name = "community")
    COMMUNITY("community");
    
    public static final a Companion;
    
    @n(name = "global")
    GLOBAL("global"), 
    @n(name = "moderator")
    MODERATOR("moderator");
    
    private static final String MOD_AWARDS_TYPE = "gid_mod";
    private static final String PURCHASE_TYPE_PREFIX = "gid_";
    private final String apiType;
    
    static {
        Companion = new a();
    }
    
    private AwardType(final String apiType) {
        this.apiType = apiType;
    }
    
    @Override
    public String toString() {
        return this.apiType;
    }
    
    public static final class a
    {
        public static String a(final AwardType awardType, final AwardSubType awardSubType, String s) {
            e.f((Object)s, "awardId");
            if (awardSubType != null) {
                AwardSubType a;
                if (awardType != null) {
                    a = c.a(awardType);
                }
                else {
                    a = null;
                }
                if (a != awardSubType) {
                    final StringBuilder r = a.r("gid_");
                    s = awardSubType.toString();
                    final Locale us = Locale.US;
                    e.e((Object)us, "US");
                    final String lowerCase = s.toLowerCase(us);
                    e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    r.append(lowerCase);
                    return r.toString();
                }
            }
            if (awardType == AwardType.MODERATOR) {
                s = "gid_mod";
            }
            else if (awardType != AwardType.GLOBAL || !j.O0(s, "gid_", false)) {
                if (awardType != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("gid_");
                    sb.append(awardType);
                    s = sb.toString();
                }
                else {
                    s = "gid_unknown";
                }
            }
            return s;
        }
    }
}
