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

public final class ContentTag
{
    public static final a<ContentTag, ContentTag.ContentTag$Builder> ADAPTER;
    public final List<String> mature_themes;
    public final String rating;
    public final String rating_version;
    public final List<String> survey_answers;
    
    static {
        ADAPTER = (a)new ContentTag.ContentTag$ContentTagAdapter((ContentTag$1)null);
    }
    
    private ContentTag(final ContentTag.ContentTag$Builder contentTag$Builder) {
        final List access$100 = ContentTag.ContentTag$Builder.access$100(contentTag$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)ContentTag.ContentTag$Builder.access$100(contentTag$Builder));
        }
        this.mature_themes = unmodifiableList;
        List<String> unmodifiableList2;
        if (ContentTag.ContentTag$Builder.access$200(contentTag$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)ContentTag.ContentTag$Builder.access$200(contentTag$Builder));
        }
        this.survey_answers = unmodifiableList2;
        this.rating_version = ContentTag.ContentTag$Builder.access$300(contentTag$Builder);
        this.rating = ContentTag.ContentTag$Builder.access$400(contentTag$Builder);
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
        if (!(o instanceof ContentTag)) {
            return false;
        }
        final ContentTag contentTag = (ContentTag)o;
        final List<String> mature_themes = this.mature_themes;
        final List<String> mature_themes2 = contentTag.mature_themes;
        if (mature_themes == mature_themes2 || (mature_themes != null && mature_themes.equals(mature_themes2))) {
            final List<String> survey_answers = this.survey_answers;
            final List<String> survey_answers2 = contentTag.survey_answers;
            if (survey_answers == survey_answers2 || (survey_answers != null && survey_answers.equals(survey_answers2))) {
                final String rating_version = this.rating_version;
                final String rating_version2 = contentTag.rating_version;
                if (rating_version == rating_version2 || (rating_version != null && rating_version.equals(rating_version2))) {
                    final String rating = this.rating;
                    final String rating2 = contentTag.rating;
                    boolean b2 = b;
                    if (rating == rating2) {
                        return b2;
                    }
                    if (rating != null && rating.equals(rating2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final List<String> mature_themes = this.mature_themes;
        int hashCode = 0;
        int hashCode2;
        if (mature_themes == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = mature_themes.hashCode();
        }
        final List<String> survey_answers = this.survey_answers;
        int hashCode3;
        if (survey_answers == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = survey_answers.hashCode();
        }
        final String rating_version = this.rating_version;
        int hashCode4;
        if (rating_version == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = rating_version.hashCode();
        }
        final String rating = this.rating;
        if (rating != null) {
            hashCode = rating.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ContentTag{mature_themes=");
        k.append(this.mature_themes);
        k.append(", survey_answers=");
        k.append(this.survey_answers);
        k.append(", rating_version=");
        k.append(this.rating_version);
        k.append(", rating=");
        return b.j(k, this.rating, "}");
    }
    
    public void write(final e e) throws IOException {
        ContentTag.ADAPTER.write(e, (Object)this);
    }
}
