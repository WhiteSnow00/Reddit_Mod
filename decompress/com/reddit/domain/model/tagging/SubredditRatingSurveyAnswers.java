// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ah2.f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005H\u00c6\u0003J/\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswers;", "", "version", "", "answers", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAnswers", "()Ljava/util/Map;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditRatingSurveyAnswers
{
    private final Map<String, List<String>> answers;
    private final String version;
    
    public SubredditRatingSurveyAnswers(final String version, final Map<String, ? extends List<String>> answers) {
        f.f((Object)version, "version");
        f.f((Object)answers, "answers");
        this.version = version;
        this.answers = (Map<String, List<String>>)answers;
    }
    
    public final String component1() {
        return this.version;
    }
    
    public final Map<String, List<String>> component2() {
        return this.answers;
    }
    
    public final SubredditRatingSurveyAnswers copy(final String s, final Map<String, ? extends List<String>> map) {
        f.f((Object)s, "version");
        f.f((Object)map, "answers");
        return new SubredditRatingSurveyAnswers(s, map);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditRatingSurveyAnswers)) {
            return false;
        }
        final SubredditRatingSurveyAnswers subredditRatingSurveyAnswers = (SubredditRatingSurveyAnswers)o;
        return f.a((Object)this.version, (Object)subredditRatingSurveyAnswers.version) && f.a((Object)this.answers, (Object)subredditRatingSurveyAnswers.answers);
    }
    
    public final Map<String, List<String>> getAnswers() {
        return this.answers;
    }
    
    public final String getVersion() {
        return this.version;
    }
    
    @Override
    public int hashCode() {
        return this.answers.hashCode() + this.version.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditRatingSurveyAnswers(version=");
        k.append(this.version);
        k.append(", answers=");
        return a40.f.p(k, (Map)this.answers, ')');
    }
}
