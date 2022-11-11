// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import java.io.Serializable;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/PostPollParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/PostPollParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "", "nullableIntAdapter", "", "nullableLongAdapter", "", "booleanAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPollParamsJsonAdapter extends JsonAdapter<PostPollParams>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PostPollParamsJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "sr", "title", "text", "api_type", "resubmit", "validate_on_submit", "show_error_list", "options", "duration", "end_timestamp", "flair_id", "flair_text", "nsfw", "spoiler", "discussion_type", "prediction" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "subreddit");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "pollOptions");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "pollDurationDays");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "pollEndTimestampSeconds");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNsfw");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "discussionType");
    }
    
    public PostPollParams fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Integer n = null;
        Serializable s2;
        Serializable s = s2 = n;
        Serializable s4;
        Serializable s3 = s4 = s2;
        Serializable s6;
        String s5 = (String)(s6 = s4);
        Serializable s8;
        String s7 = (String)(s8 = s6);
        Serializable s9;
        Object o = s9 = s8;
        Object o2;
        Number n2 = (Number)(o2 = s9);
        Object o4;
        Object o3 = o4 = o2;
        while (jsonReader.hasNext()) {
            Object o5 = null;
            Object o6 = null;
            Integer n3 = null;
            Boolean b4 = null;
            Label_0797: {
                String s11 = null;
                Integer n4 = null;
                Label_0791: {
                    Label_0788: {
                        Label_0785: {
                            Label_0782: {
                                Label_0779: {
                                    Label_0775: {
                                        switch (jsonReader.E(this.options)) {
                                            case 15: {
                                                s2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (s2 != null) {
                                                    o5 = s9;
                                                    o6 = n2;
                                                    break Label_0779;
                                                }
                                                throw a.n("isPredictionPoll", "prediction", jsonReader);
                                            }
                                            case 14: {
                                                o4 = this.nullableStringAdapter.fromJson(jsonReader);
                                                break;
                                            }
                                            case 13: {
                                                final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b2 != null) {
                                                    o5 = s9;
                                                    n3 = (Integer)(Object)b2;
                                                    o6 = n2;
                                                    break Label_0782;
                                                }
                                                throw a.n("isSpoiler", "spoiler", jsonReader);
                                            }
                                            case 12: {
                                                final Boolean b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                if (b3 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b3;
                                                    break Label_0785;
                                                }
                                                throw a.n("isNsfw", "nsfw", jsonReader);
                                            }
                                            case 11: {
                                                o3 = this.stringAdapter.fromJson(jsonReader);
                                                if (o3 != null) {
                                                    break;
                                                }
                                                throw a.n("flairText", "flair_text", jsonReader);
                                            }
                                            case 10: {
                                                o2 = this.stringAdapter.fromJson(jsonReader);
                                                if (o2 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    break Label_0785;
                                                }
                                                throw a.n("flairId", "flair_id", jsonReader);
                                            }
                                            case 9: {
                                                o6 = this.nullableLongAdapter.fromJson(jsonReader);
                                                break Label_0775;
                                            }
                                            case 8: {
                                                o5 = this.nullableIntAdapter.fromJson(jsonReader);
                                                o6 = n2;
                                                break Label_0779;
                                            }
                                            case 7: {
                                                o = this.listOfStringAdapter.fromJson(jsonReader);
                                                if (o != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    break Label_0785;
                                                }
                                                throw a.n("pollOptions", "options", jsonReader);
                                            }
                                            case 6: {
                                                s8 = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s8 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    break Label_0785;
                                                }
                                                throw a.n("showErrorList", "show_error_list", jsonReader);
                                            }
                                            case 5: {
                                                s7 = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s7 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    break Label_0785;
                                                }
                                                throw a.n("validateOnSubmit", "validate_on_submit", jsonReader);
                                            }
                                            case 4: {
                                                s6 = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s6 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    break Label_0785;
                                                }
                                                throw a.n("resubmit", "resubmit", jsonReader);
                                            }
                                            case 3: {
                                                final String s10 = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s10 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    s11 = s10;
                                                    break Label_0788;
                                                }
                                                throw a.n("apiType", "api_type", jsonReader);
                                            }
                                            case 2: {
                                                final String s12 = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s12 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    s11 = s5;
                                                    n4 = (Integer)s12;
                                                    break Label_0791;
                                                }
                                                throw a.n("text", "text", jsonReader);
                                            }
                                            case 1: {
                                                s3 = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s3 != null) {
                                                    o6 = n2;
                                                    o5 = s9;
                                                    n3 = n;
                                                    b4 = b;
                                                    break Label_0797;
                                                }
                                                throw a.n("title", "title", jsonReader);
                                            }
                                            case 0: {
                                                s = (String)this.stringAdapter.fromJson(jsonReader);
                                                if (s != null) {
                                                    continue;
                                                }
                                                throw a.n("subreddit", "sr", jsonReader);
                                            }
                                            case -1: {
                                                jsonReader.H();
                                                jsonReader.F1();
                                                break;
                                            }
                                        }
                                        o6 = n2;
                                    }
                                    o5 = s9;
                                }
                                n3 = n;
                            }
                            b4 = b;
                        }
                        s11 = s5;
                    }
                    n4 = (Integer)s4;
                }
                s5 = s11;
                s4 = n4;
            }
            b = b4;
            n = n3;
            s9 = (Serializable)o5;
            n2 = (Number)o6;
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("subreddit", "sr", jsonReader);
        }
        if (s3 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (s4 == null) {
            throw a.h("text", "text", jsonReader);
        }
        if (s5 == null) {
            throw a.h("apiType", "api_type", jsonReader);
        }
        if (s6 == null) {
            throw a.h("resubmit", "resubmit", jsonReader);
        }
        if (s7 == null) {
            throw a.h("validateOnSubmit", "validate_on_submit", jsonReader);
        }
        if (s8 == null) {
            throw a.h("showErrorList", "show_error_list", jsonReader);
        }
        if (o == null) {
            throw a.h("pollOptions", "options", jsonReader);
        }
        if (o2 == null) {
            throw a.h("flairId", "flair_id", jsonReader);
        }
        if (o3 == null) {
            throw a.h("flairText", "flair_text", jsonReader);
        }
        if (b == null) {
            throw a.h("isNsfw", "nsfw", jsonReader);
        }
        final boolean booleanValue = b;
        if (n == null) {
            throw a.h("isSpoiler", "spoiler", jsonReader);
        }
        final boolean booleanValue2 = (Object)n;
        if (s2 != null) {
            return new PostPollParams((String)s, (String)s3, (String)s4, s5, (String)s6, s7, (String)s8, (List)o, (Integer)s9, (Long)n2, (String)o2, (String)o3, booleanValue, booleanValue2, (String)o4, (boolean)s2);
        }
        throw a.h("isPredictionPoll", "prediction", jsonReader);
    }
    
    public void toJson(final x x, final PostPollParams postPollParams) {
        e.f((Object)x, "writer");
        if (postPollParams != null) {
            x.h();
            x.u("sr");
            this.stringAdapter.toJson(x, (Object)postPollParams.getSubreddit());
            x.u("title");
            this.stringAdapter.toJson(x, (Object)postPollParams.getTitle());
            x.u("text");
            this.stringAdapter.toJson(x, (Object)postPollParams.getText());
            x.u("api_type");
            this.stringAdapter.toJson(x, (Object)postPollParams.getApiType());
            x.u("resubmit");
            this.stringAdapter.toJson(x, (Object)postPollParams.getResubmit());
            x.u("validate_on_submit");
            this.stringAdapter.toJson(x, (Object)postPollParams.getValidateOnSubmit());
            x.u("show_error_list");
            this.stringAdapter.toJson(x, (Object)postPollParams.getShowErrorList());
            x.u("options");
            this.listOfStringAdapter.toJson(x, (Object)postPollParams.getPollOptions());
            x.u("duration");
            this.nullableIntAdapter.toJson(x, (Object)postPollParams.getPollDurationDays());
            x.u("end_timestamp");
            this.nullableLongAdapter.toJson(x, (Object)postPollParams.getPollEndTimestampSeconds());
            x.u("flair_id");
            this.stringAdapter.toJson(x, (Object)postPollParams.getFlairId());
            x.u("flair_text");
            this.stringAdapter.toJson(x, (Object)postPollParams.getFlairText());
            x.u("nsfw");
            this.booleanAdapter.toJson(x, (Object)postPollParams.isNsfw());
            x.u("spoiler");
            this.booleanAdapter.toJson(x, (Object)postPollParams.isSpoiler());
            x.u("discussion_type");
            this.nullableStringAdapter.toJson(x, (Object)postPollParams.getDiscussionType());
            x.u("prediction");
            this.booleanAdapter.toJson(x, (Object)postPollParams.isPredictionPoll());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PostPollParams)";
    }
}
