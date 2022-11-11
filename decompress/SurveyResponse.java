// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import al0.g7;
import java.util.Collections;
import java.util.List;
import et.a;

public final class SurveyResponse
{
    public static final a<SurveyResponse, SurveyResponse.SurveyResponse$Builder> ADAPTER;
    public final List<String> choices;
    public final List<String> choices_by_index;
    
    static {
        ADAPTER = (a)new SurveyResponse.SurveyResponse$SurveyResponseAdapter((SurveyResponse$1)null);
    }
    
    private SurveyResponse(final SurveyResponse.SurveyResponse$Builder surveyResponse$Builder) {
        final List access$100 = SurveyResponse.SurveyResponse$Builder.access$100(surveyResponse$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)SurveyResponse.SurveyResponse$Builder.access$100(surveyResponse$Builder));
        }
        this.choices_by_index = unmodifiableList;
        List<String> unmodifiableList2;
        if (SurveyResponse.SurveyResponse$Builder.access$200(surveyResponse$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)SurveyResponse.SurveyResponse$Builder.access$200(surveyResponse$Builder));
        }
        this.choices = unmodifiableList2;
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
        if (!(o instanceof SurveyResponse)) {
            return false;
        }
        final SurveyResponse surveyResponse = (SurveyResponse)o;
        final List<String> choices_by_index = this.choices_by_index;
        final List<String> choices_by_index2 = surveyResponse.choices_by_index;
        if (choices_by_index == choices_by_index2 || (choices_by_index != null && choices_by_index.equals(choices_by_index2))) {
            final List<String> choices = this.choices;
            final List<String> choices2 = surveyResponse.choices;
            boolean b2 = b;
            if (choices == choices2) {
                return b2;
            }
            if (choices != null && choices.equals(choices2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final List<String> choices_by_index = this.choices_by_index;
        int hashCode = 0;
        int hashCode2;
        if (choices_by_index == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = choices_by_index.hashCode();
        }
        final List<String> choices = this.choices;
        if (choices != null) {
            hashCode = choices.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SurveyResponse{choices_by_index=");
        r.append(this.choices_by_index);
        r.append(", choices=");
        return g7.k(r, (List)this.choices, "}");
    }
    
    public void write(final e e) throws IOException {
        SurveyResponse.ADAPTER.write(e, (Object)this);
    }
}
