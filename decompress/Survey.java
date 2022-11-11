// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Survey
{
    public static final a<Survey, Survey.Survey$Builder> ADAPTER;
    public final String experiment_name;
    public final String experiment_variant;
    public final String experiment_version;
    public final Integer max;
    public final Integer min;
    public final String parent_question_id;
    public final String question;
    public final String question_id;
    public final Integer score;
    public final String text;
    public final String type;
    
    static {
        ADAPTER = (a)new Survey.Survey$SurveyAdapter((Survey$1)null);
    }
    
    private Survey(final Survey.Survey$Builder survey$Builder) {
        this.type = Survey.Survey$Builder.access$100(survey$Builder);
        this.min = Survey.Survey$Builder.access$200(survey$Builder);
        this.max = Survey.Survey$Builder.access$300(survey$Builder);
        this.score = Survey.Survey$Builder.access$400(survey$Builder);
        this.text = Survey.Survey$Builder.access$500(survey$Builder);
        this.experiment_name = Survey.Survey$Builder.access$600(survey$Builder);
        this.experiment_variant = Survey.Survey$Builder.access$700(survey$Builder);
        this.experiment_version = Survey.Survey$Builder.access$800(survey$Builder);
        this.question = Survey.Survey$Builder.access$900(survey$Builder);
        this.question_id = Survey.Survey$Builder.access$1000(survey$Builder);
        this.parent_question_id = Survey.Survey$Builder.access$1100(survey$Builder);
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
        if (!(o instanceof Survey)) {
            return false;
        }
        final Survey survey = (Survey)o;
        final String type = this.type;
        final String type2 = survey.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Integer min = this.min;
            final Integer min2 = survey.min;
            if (min == min2 || (min != null && min.equals(min2))) {
                final Integer max = this.max;
                final Integer max2 = survey.max;
                if (max == max2 || (max != null && max.equals(max2))) {
                    final Integer score = this.score;
                    final Integer score2 = survey.score;
                    if (score == score2 || (score != null && score.equals(score2))) {
                        final String text = this.text;
                        final String text2 = survey.text;
                        if (text == text2 || (text != null && text.equals(text2))) {
                            final String experiment_name = this.experiment_name;
                            final String experiment_name2 = survey.experiment_name;
                            if (experiment_name == experiment_name2 || (experiment_name != null && experiment_name.equals(experiment_name2))) {
                                final String experiment_variant = this.experiment_variant;
                                final String experiment_variant2 = survey.experiment_variant;
                                if (experiment_variant == experiment_variant2 || (experiment_variant != null && experiment_variant.equals(experiment_variant2))) {
                                    final String experiment_version = this.experiment_version;
                                    final String experiment_version2 = survey.experiment_version;
                                    if (experiment_version == experiment_version2 || (experiment_version != null && experiment_version.equals(experiment_version2))) {
                                        final String question = this.question;
                                        final String question2 = survey.question;
                                        if (question == question2 || (question != null && question.equals(question2))) {
                                            final String question_id = this.question_id;
                                            final String question_id2 = survey.question_id;
                                            if (question_id == question_id2 || (question_id != null && question_id.equals(question_id2))) {
                                                final String parent_question_id = this.parent_question_id;
                                                final String parent_question_id2 = survey.parent_question_id;
                                                boolean b2 = b;
                                                if (parent_question_id == parent_question_id2) {
                                                    return b2;
                                                }
                                                if (parent_question_id != null && parent_question_id.equals(parent_question_id2)) {
                                                    b2 = b;
                                                    return b2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Integer min = this.min;
        int hashCode3;
        if (min == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = min.hashCode();
        }
        final Integer max = this.max;
        int hashCode4;
        if (max == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = max.hashCode();
        }
        final Integer score = this.score;
        int hashCode5;
        if (score == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = score.hashCode();
        }
        final String text = this.text;
        int hashCode6;
        if (text == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = text.hashCode();
        }
        final String experiment_name = this.experiment_name;
        int hashCode7;
        if (experiment_name == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = experiment_name.hashCode();
        }
        final String experiment_variant = this.experiment_variant;
        int hashCode8;
        if (experiment_variant == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = experiment_variant.hashCode();
        }
        final String experiment_version = this.experiment_version;
        int hashCode9;
        if (experiment_version == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = experiment_version.hashCode();
        }
        final String question = this.question;
        int hashCode10;
        if (question == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = question.hashCode();
        }
        final String question_id = this.question_id;
        int hashCode11;
        if (question_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = question_id.hashCode();
        }
        final String parent_question_id = this.parent_question_id;
        if (parent_question_id != null) {
            hashCode = parent_question_id.hashCode();
        }
        return (((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Survey{type=");
        r.append(this.type);
        r.append(", min=");
        r.append(this.min);
        r.append(", max=");
        r.append(this.max);
        r.append(", score=");
        r.append(this.score);
        r.append(", text=");
        r.append(this.text);
        r.append(", experiment_name=");
        r.append(this.experiment_name);
        r.append(", experiment_variant=");
        r.append(this.experiment_variant);
        r.append(", experiment_version=");
        r.append(this.experiment_version);
        r.append(", question=");
        r.append(this.question);
        r.append(", question_id=");
        r.append(this.question_id);
        r.append(", parent_question_id=");
        return a.o(r, this.parent_question_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Survey.ADAPTER.write(e, (Object)this);
    }
}
