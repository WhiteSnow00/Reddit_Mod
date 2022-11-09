// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import pg2.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.modtools.ModQueueTriggers;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.mod.notes.domain.model.NoteLabel;
import java.util.Map;
import com.reddit.domain.model.mod.BannedBy;
import com.reddit.domain.awards.model.Award;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0011R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0011R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0011R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0011R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0011R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0011R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063" }, d2 = { "Lcom/reddit/domain/model/CommentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Comment;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "nullableStringAdapter", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "nullableListOfFlairRichTextItemAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "Lcom/reddit/domain/model/mod/BannedBy;", "nullableBannedByAdapter", "nullableIntAdapter", "listOfListOfStringAdapter", "Lcom/reddit/mod/notes/domain/model/NoteLabel;", "nullableNoteLabelAdapter", "", "longAdapter", "Lcom/reddit/domain/awards/model/Award;", "listOfAwardAdapter", "listOfStringAdapter", "Lcom/reddit/domain/model/RichTextResponse;", "nullableRichTextResponseAdapter", "", "Lcom/reddit/domain/model/MediaMetaData;", "nullableMapOfStringMediaMetaDataAdapter", "nullableAwardAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommentJsonAdapter extends JsonAdapter<Comment>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Comment> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<Award>> listOfAwardAdapter;
    private final JsonAdapter<List<List<String>>> listOfListOfStringAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Award> nullableAwardAdapter;
    private final JsonAdapter<BannedBy> nullableBannedByAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<FlairRichTextItem>> nullableListOfFlairRichTextItemAdapter;
    private final JsonAdapter<Map<String, MediaMetaData>> nullableMapOfStringMediaMetaDataAdapter;
    private final JsonAdapter<NoteLabel> nullableNoteLabelAdapter;
    private final JsonAdapter<RichTextResponse> nullableRichTextResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CommentJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "parent_id", "body", "body_html", "score", "author", "modProxyAuthor", "modProxyAuthorKindWithId", "author_flair_text", "author_flair_richtext", "author_cakeday", "authorIconUrl", "archived", "locked", "likes", "link_title", "distinguished", "stickied", "subreddit", "subreddit_id", "subreddit_name_prefixed", "link_id", "score_hidden", "link_url", "subscribed", "saved", "approved", "spam", "banned_by", "removed", "approved_by", "num_reports", "mod_reports", "user_reports", "modNoteLabel", "depth", "created_utc", "all_awardings", "treatment_tags", "author_flair_template_id", "author_flair_background_color", "author_flair_text_color", "rtjson", "author_fullname", "collapsed", "media_metadata", "associated_award", "profile_img", "profile_over_18", "collapsed_because_crowd_control", "collapsed_reason_code", "unrepliable_reason", "author_snoovatar_img", "authorIconIsDefault", "authorIconIsNsfw", "comment_type" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "score");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "modProxyAuthor");
        this.nullableListOfFlairRichTextItemAdapter = (JsonAdapter<List<FlairRichTextItem>>)y.c((Type)a0.d((Class)List.class, new Type[] { FlairRichTextItem.class }), (Set)instance, "authorFlairRichText");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "authorCakeDay");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "archived");
        this.nullableBannedByAdapter = (JsonAdapter<BannedBy>)y.c((Type)BannedBy.class, (Set)instance, "bannedBy");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "numReports");
        this.listOfListOfStringAdapter = (JsonAdapter<List<List<String>>>)y.c((Type)a0.d((Class)List.class, new Type[] { (Type)a0.d((Class)List.class, new Type[] { String.class }) }), (Set)instance, "modReports");
        this.nullableNoteLabelAdapter = (JsonAdapter<NoteLabel>)y.c((Type)NoteLabel.class, (Set)instance, "modNoteLabel");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.listOfAwardAdapter = (JsonAdapter<List<Award>>)y.c((Type)a0.d((Class)List.class, new Type[] { Award.class }), (Set)instance, "awards");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "treatmentTags");
        this.nullableRichTextResponseAdapter = (JsonAdapter<RichTextResponse>)y.c((Type)RichTextResponse.class, (Set)instance, "rtjson");
        this.nullableMapOfStringMediaMetaDataAdapter = (JsonAdapter<Map<String, MediaMetaData>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, MediaMetaData.class }), (Set)instance, "mediaMetadata");
        this.nullableAwardAdapter = (JsonAdapter<Award>)y.c((Type)Award.class, (Set)instance, "associatedAward");
    }
    
    public Comment fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Integer value = 0;
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Integer n = value;
        final Boolean b2;
        Boolean b = b2 = false;
        Boolean b4;
        Boolean b3 = b4 = b2;
        Boolean b6;
        Boolean b5 = b6 = b4;
        Long value2 = 0L;
        int n3;
        int n2 = n3 = -1;
        Object o = null;
        Object o2 = null;
        final String s = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        Object o11 = null;
        Object o12 = null;
        Object o13 = null;
        Object o14 = null;
        Object o15 = null;
        Object o16 = null;
        Object o17 = null;
        Object o18 = null;
        Object o19 = null;
        Object o20 = null;
        Object o21 = null;
        Object o22 = null;
        Object o23 = null;
        Object o24 = null;
        Object o25 = null;
        Object o26 = null;
        Object o27 = null;
        Object o28 = null;
        Object o29 = null;
        Object o30 = null;
        Object o31 = null;
        Object o32 = null;
        Object o33 = null;
        Object o34 = null;
        Object o35 = null;
        Object o36 = null;
        Object o37 = null;
        Object o38 = null;
        Object o39 = null;
        Object o40 = null;
        Object o41 = null;
        Object o42 = null;
        Object o43 = null;
        Boolean b8;
        Boolean b7 = b8 = b6;
        Object o44 = null;
        Boolean b9 = b2;
        Object o45 = s;
        while (jsonReader.hasNext()) {
            int n4 = 0;
            Label_2296: {
                int n6 = 0;
                Label_1404: {
                    int n5 = 0;
                    switch (jsonReader.F(this.options)) {
                        default: {
                            n4 = n3;
                            break Label_2296;
                        }
                        case 56: {
                            o36 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -67108865;
                            break;
                        }
                        case 55: {
                            b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b != null) {
                                n5 = -33554433;
                                break;
                            }
                            throw a.n("authorIconIsNsfw", "authorIconIsNsfw", jsonReader);
                        }
                        case 54: {
                            b9 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b9 != null) {
                                n2 &= 0xFEFFFFFF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("authorIconIsDefault", "authorIconIsDefault", jsonReader);
                        }
                        case 53: {
                            o35 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -8388609;
                            break;
                        }
                        case 52: {
                            o34 = this.nullableStringAdapter.fromJson(jsonReader);
                            n5 = -4194305;
                            break;
                        }
                        case 51: {
                            o33 = this.nullableStringAdapter.fromJson(jsonReader);
                            n2 &= 0xFFDFFFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 50: {
                            o32 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n2 &= 0xFFEFFFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 49: {
                            o31 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n2 &= 0xFFF7FFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 48: {
                            o30 = this.nullableStringAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFBFFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 47: {
                            o29 = this.nullableAwardAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFDFFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 46: {
                            o28 = this.nullableMapOfStringMediaMetaDataAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFEFFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 45: {
                            b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b3 != null) {
                                n2 &= 0xFFFF7FFF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("collapsed", "collapsed", jsonReader);
                        }
                        case 44: {
                            o43 = this.stringAdapter.fromJson(jsonReader);
                            if (o43 != null) {
                                n2 &= 0xFFFFBFFF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("authorKindWithId", "author_fullname", jsonReader);
                        }
                        case 43: {
                            o27 = this.nullableRichTextResponseAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFFDFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 42: {
                            o26 = this.nullableStringAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFFEFFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 41: {
                            o25 = this.nullableStringAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFFF7FF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 40: {
                            o24 = this.nullableStringAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFFFBFF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 39: {
                            o42 = this.listOfStringAdapter.fromJson(jsonReader);
                            if (o42 != null) {
                                n2 &= 0xFFFFFDFF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("treatmentTags", "treatment_tags", jsonReader);
                        }
                        case 38: {
                            o41 = this.listOfAwardAdapter.fromJson(jsonReader);
                            if (o41 != null) {
                                n2 &= 0xFFFFFEFF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("awards", "all_awardings", jsonReader);
                        }
                        case 37: {
                            value2 = (Long)this.longAdapter.fromJson(jsonReader);
                            if (value2 != null) {
                                n2 &= 0xFFFFFFBF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("createdUtc", "created_utc", jsonReader);
                        }
                        case 36: {
                            n = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n != null) {
                                n2 &= 0xFFFFFFDF;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("depth", "depth", jsonReader);
                        }
                        case 35: {
                            o23 = this.nullableNoteLabelAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFFFFEF;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 34: {
                            o40 = this.listOfListOfStringAdapter.fromJson(jsonReader);
                            if (o40 != null) {
                                n2 &= 0xFFFFFFFB;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("userReports", "user_reports", jsonReader);
                        }
                        case 33: {
                            o39 = this.listOfListOfStringAdapter.fromJson(jsonReader);
                            if (o39 != null) {
                                n2 &= 0xFFFFFFFD;
                                n4 = n3;
                                break Label_2296;
                            }
                            throw a.n("modReports", "mod_reports", jsonReader);
                        }
                        case 32: {
                            o22 = this.nullableIntAdapter.fromJson(jsonReader);
                            n2 &= 0xFFFFFFFE;
                            n4 = n3;
                            break Label_2296;
                        }
                        case 31: {
                            o21 = this.nullableStringAdapter.fromJson(jsonReader);
                            n6 = Integer.MAX_VALUE;
                            break Label_1404;
                        }
                        case 30: {
                            o20 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -1073741825;
                            break Label_1404;
                        }
                        case 29: {
                            o19 = this.nullableBannedByAdapter.fromJson(jsonReader);
                            n6 = -536870913;
                            break Label_1404;
                        }
                        case 28: {
                            o18 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -268435457;
                            break Label_1404;
                        }
                        case 27: {
                            o17 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n6 = -134217729;
                            break Label_1404;
                        }
                        case 26: {
                            b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b4 != null) {
                                n6 = -67108865;
                                break Label_1404;
                            }
                            throw a.n("saved", "saved", jsonReader);
                        }
                        case 25: {
                            b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b5 != null) {
                                n6 = -33554433;
                                break Label_1404;
                            }
                            throw a.n("subscribed", "subscribed", jsonReader);
                        }
                        case 24: {
                            o16 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFEFFFFFF);
                            break Label_2296;
                        }
                        case 23: {
                            b6 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b6 != null) {
                                n6 = -8388609;
                                break Label_1404;
                            }
                            throw a.n("scoreHidden", "score_hidden", jsonReader);
                        }
                        case 22: {
                            o38 = this.stringAdapter.fromJson(jsonReader);
                            if (o38 != null) {
                                n6 = -4194305;
                                break Label_1404;
                            }
                            throw a.n("linkKindWithId", "link_id", jsonReader);
                        }
                        case 21: {
                            o37 = this.stringAdapter.fromJson(jsonReader);
                            if (o37 != null) {
                                n4 = (n3 & 0xFFDFFFFF);
                                break Label_2296;
                            }
                            throw a.n("subredditNamePrefixed", "subreddit_name_prefixed", jsonReader);
                        }
                        case 20: {
                            o45 = this.stringAdapter.fromJson(jsonReader);
                            if (o45 != null) {
                                n3 &= 0xFFEFFFFF;
                                continue;
                            }
                            throw a.n("subredditKindWithId", "subreddit_id", jsonReader);
                        }
                        case 19: {
                            o3 = this.stringAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                n4 = (n3 & 0xFFF7FFFF);
                                break Label_2296;
                            }
                            throw a.n("subreddit", "subreddit", jsonReader);
                        }
                        case 18: {
                            false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (false != null) {
                                n4 = (n3 & 0xFFFBFFFF);
                                break Label_2296;
                            }
                            throw a.n("stickied", "stickied", jsonReader);
                        }
                        case 17: {
                            o15 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFDFFFF);
                            break Label_2296;
                        }
                        case 16: {
                            o14 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFEFFFF);
                            break Label_2296;
                        }
                        case 15: {
                            o13 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFF7FFF);
                            break Label_2296;
                        }
                        case 14: {
                            b8 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b8 != null) {
                                n4 = (n3 & 0xFFFFBFFF);
                                break Label_2296;
                            }
                            throw a.n("locked", "locked", jsonReader);
                        }
                        case 13: {
                            b7 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b7 != null) {
                                n4 = (n3 & 0xFFFFDFFF);
                                break Label_2296;
                            }
                            throw a.n("archived", "archived", jsonReader);
                        }
                        case 12: {
                            o12 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFFEFFF);
                            break Label_2296;
                        }
                        case 11: {
                            o11 = this.nullableBooleanAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFFF7FF);
                            break Label_2296;
                        }
                        case 10: {
                            o10 = this.nullableListOfFlairRichTextItemAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFFFBFF);
                            break Label_2296;
                        }
                        case 9: {
                            o9 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFFFDFF);
                            break Label_2296;
                        }
                        case 8: {
                            o8 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFFFEFF);
                            break Label_2296;
                        }
                        case 7: {
                            o7 = this.nullableStringAdapter.fromJson(jsonReader);
                            n4 = (n3 & 0xFFFFFF7F);
                            break Label_2296;
                        }
                        case 6: {
                            o4 = this.stringAdapter.fromJson(jsonReader);
                            if (o4 != null) {
                                n4 = (n3 & 0xFFFFFFBF);
                                break Label_2296;
                            }
                            throw a.n("author", "author", jsonReader);
                        }
                        case 5: {
                            value = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (value != null) {
                                n4 = (n3 & 0xFFFFFFDF);
                                break Label_2296;
                            }
                            throw a.n("score", "score", jsonReader);
                        }
                        case 4: {
                            o44 = this.stringAdapter.fromJson(jsonReader);
                            if (o44 != null) {
                                n4 = (n3 & 0xFFFFFFEF);
                                break Label_2296;
                            }
                            throw a.n("bodyHtml", "body_html", jsonReader);
                        }
                        case 3: {
                            o5 = this.stringAdapter.fromJson(jsonReader);
                            if (o5 != null) {
                                n4 = (n3 & 0xFFFFFFF7);
                                break Label_2296;
                            }
                            throw a.n("body", "body", jsonReader);
                        }
                        case 2: {
                            o6 = this.stringAdapter.fromJson(jsonReader);
                            if (o6 != null) {
                                n4 = (n3 & 0xFFFFFFFB);
                                break Label_2296;
                            }
                            throw a.n("parentKindWithId", "parent_id", jsonReader);
                        }
                        case 1: {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                n4 = (n3 & 0xFFFFFFFD);
                                break Label_2296;
                            }
                            throw a.n("kindWithId", "name", jsonReader);
                        }
                        case 0: {
                            o = this.stringAdapter.fromJson(jsonReader);
                            if (o != null) {
                                n4 = (n3 & 0xFFFFFFFE);
                                break Label_2296;
                            }
                            throw a.n("id", "id", jsonReader);
                        }
                        case -1: {
                            jsonReader.J();
                            jsonReader.z1();
                            n4 = n3;
                            break Label_2296;
                        }
                    }
                    n2 &= n5;
                    n4 = n3;
                    break Label_2296;
                }
                n4 = (n3 & n6);
            }
            n3 = n4;
        }
        jsonReader.r();
        if (n3 == 0 && n2 == -134217592) {
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            f.d(o6, "null cannot be cast to non-null type kotlin.String");
            f.d(o5, "null cannot be cast to non-null type kotlin.String");
            f.d(o44, "null cannot be cast to non-null type kotlin.String");
            final int intValue = value;
            f.d(o4, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue = b7;
            final boolean booleanValue2 = b8;
            final boolean booleanValue3 = false;
            f.d(o3, "null cannot be cast to non-null type kotlin.String");
            f.d(o45, "null cannot be cast to non-null type kotlin.String");
            f.d(o37, "null cannot be cast to non-null type kotlin.String");
            f.d(o38, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue4 = b6;
            final boolean booleanValue5 = b5;
            final boolean booleanValue6 = b4;
            f.d(o39, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.String>>");
            f.d(o40, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.String>>");
            final int intValue2 = n;
            final long longValue = value2;
            f.d(o41, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.awards.model.Award>");
            f.d(o42, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            f.d(o43, "null cannot be cast to non-null type kotlin.String");
            return new Comment((String)o, (String)o2, (String)o6, (String)o5, (String)o44, intValue, (String)o4, (String)o7, (String)o8, (String)o9, (List)o10, (Boolean)o11, (String)o12, booleanValue, booleanValue2, (Boolean)o13, (String)o14, (String)o15, booleanValue3, (String)o3, (String)o45, (String)o37, (String)o38, booleanValue4, (String)o16, booleanValue5, booleanValue6, (Boolean)o17, (Boolean)o18, (BannedBy)o19, (Boolean)o20, (String)o21, (Integer)o22, (List)o39, (List)o40, null, (NoteLabel)o23, intValue2, longValue, null, (List)o41, (List)o42, (String)o24, (String)o25, (String)o26, (RichTextResponse)o27, (String)o43, b3, (Map)o28, (Award)o29, (String)o30, (Boolean)o31, (Boolean)o32, (String)o33, (String)o34, (String)o35, b9, b, (String)o36, 0, 136, null);
        }
        Constructor<Comment> constructorRef = this.constructorRef;
        if (constructorRef == null) {
            final Class<Integer> type = Integer.TYPE;
            final Class<Boolean> type2 = Boolean.TYPE;
            constructorRef = Comment.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, type, String.class, String.class, String.class, String.class, List.class, Boolean.class, String.class, type2, type2, Boolean.class, String.class, String.class, type2, String.class, String.class, String.class, String.class, type2, String.class, type2, type2, Boolean.class, Boolean.class, BannedBy.class, Boolean.class, String.class, Integer.class, List.class, List.class, ModQueueTriggers.class, NoteLabel.class, type, Long.TYPE, List.class, List.class, List.class, String.class, String.class, String.class, RichTextResponse.class, String.class, type2, Map.class, Award.class, String.class, Boolean.class, Boolean.class, String.class, String.class, String.class, type2, type2, String.class, type, type, a.c);
            this.constructorRef = constructorRef;
            final j a = j.a;
            f.e((Object)constructorRef, "Comment::class.java.getD\u2026his.constructorRef = it }");
        }
        final Comment instance = constructorRef.newInstance(o, o2, o6, o5, o44, value, o4, o7, o8, o9, o10, o11, o12, b7, b8, o13, o14, o15, false, o3, o45, o37, o38, b6, o16, b5, b4, o17, o18, o19, o20, o21, o22, o39, o40, null, o23, n, value2, null, o41, o42, o24, o25, o26, o27, o43, b3, o28, o29, o30, o31, o32, o33, o34, o35, b9, b, o36, n3, n2, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final Comment comment) {
        f.f((Object)x, "writer");
        if (comment != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)comment.getId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)comment.getKindWithId());
            x.w("parent_id");
            this.stringAdapter.toJson(x, (Object)comment.getParentKindWithId());
            x.w("body");
            this.stringAdapter.toJson(x, (Object)comment.getBody());
            x.w("body_html");
            this.stringAdapter.toJson(x, (Object)comment.getBodyHtml());
            x.w("score");
            this.intAdapter.toJson(x, (Object)comment.getScore());
            x.w("author");
            this.stringAdapter.toJson(x, (Object)comment.getAuthor());
            x.w("modProxyAuthor");
            this.nullableStringAdapter.toJson(x, (Object)comment.getModProxyAuthor());
            x.w("modProxyAuthorKindWithId");
            this.nullableStringAdapter.toJson(x, (Object)comment.getModProxyAuthorKindWithId());
            x.w("author_flair_text");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairText());
            x.w("author_flair_richtext");
            this.nullableListOfFlairRichTextItemAdapter.toJson(x, (Object)comment.getAuthorFlairRichText());
            x.w("author_cakeday");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getAuthorCakeDay());
            x.w("authorIconUrl");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorIconUrl());
            x.w("archived");
            this.booleanAdapter.toJson(x, (Object)comment.getArchived());
            x.w("locked");
            this.booleanAdapter.toJson(x, (Object)comment.getLocked());
            x.w("likes");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getVoteState());
            x.w("link_title");
            this.nullableStringAdapter.toJson(x, (Object)comment.getLinkTitle());
            x.w("distinguished");
            this.nullableStringAdapter.toJson(x, (Object)comment.getDistinguished());
            x.w("stickied");
            this.booleanAdapter.toJson(x, (Object)comment.getStickied());
            x.w("subreddit");
            this.stringAdapter.toJson(x, (Object)comment.getSubreddit());
            x.w("subreddit_id");
            this.stringAdapter.toJson(x, (Object)comment.getSubredditKindWithId());
            x.w("subreddit_name_prefixed");
            this.stringAdapter.toJson(x, (Object)comment.getSubredditNamePrefixed());
            x.w("link_id");
            this.stringAdapter.toJson(x, (Object)comment.getLinkKindWithId());
            x.w("score_hidden");
            this.booleanAdapter.toJson(x, (Object)comment.getScoreHidden());
            x.w("link_url");
            this.nullableStringAdapter.toJson(x, (Object)comment.getLinkUrl());
            x.w("subscribed");
            this.booleanAdapter.toJson(x, (Object)comment.getSubscribed());
            x.w("saved");
            this.booleanAdapter.toJson(x, (Object)comment.getSaved());
            x.w("approved");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getApproved());
            x.w("spam");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getSpam());
            x.w("banned_by");
            this.nullableBannedByAdapter.toJson(x, (Object)comment.getBannedBy());
            x.w("removed");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getRemoved());
            x.w("approved_by");
            this.nullableStringAdapter.toJson(x, (Object)comment.getApprovedBy());
            x.w("num_reports");
            this.nullableIntAdapter.toJson(x, (Object)comment.getNumReports());
            x.w("mod_reports");
            this.listOfListOfStringAdapter.toJson(x, (Object)comment.getModReports());
            x.w("user_reports");
            this.listOfListOfStringAdapter.toJson(x, (Object)comment.getUserReports());
            x.w("modNoteLabel");
            this.nullableNoteLabelAdapter.toJson(x, (Object)comment.getModNoteLabel());
            x.w("depth");
            this.intAdapter.toJson(x, (Object)comment.getDepth());
            x.w("created_utc");
            this.longAdapter.toJson(x, (Object)comment.getCreatedUtc());
            x.w("all_awardings");
            this.listOfAwardAdapter.toJson(x, (Object)comment.getAwards());
            x.w("treatment_tags");
            this.listOfStringAdapter.toJson(x, (Object)comment.getTreatmentTags());
            x.w("author_flair_template_id");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairTemplateId());
            x.w("author_flair_background_color");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairBackgroundColor());
            x.w("author_flair_text_color");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairTextColor());
            x.w("rtjson");
            this.nullableRichTextResponseAdapter.toJson(x, (Object)comment.getRtjson());
            x.w("author_fullname");
            this.stringAdapter.toJson(x, (Object)comment.getAuthorKindWithId());
            x.w("collapsed");
            this.booleanAdapter.toJson(x, (Object)comment.getCollapsed());
            x.w("media_metadata");
            this.nullableMapOfStringMediaMetaDataAdapter.toJson(x, (Object)comment.getMediaMetadata());
            x.w("associated_award");
            this.nullableAwardAdapter.toJson(x, (Object)comment.getAssociatedAward());
            x.w("profile_img");
            this.nullableStringAdapter.toJson(x, (Object)comment.getProfileImg());
            x.w("profile_over_18");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getProfileOver18());
            x.w("collapsed_because_crowd_control");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.isCollapsedBecauseOfCrowdControl());
            x.w("collapsed_reason_code");
            this.nullableStringAdapter.toJson(x, (Object)comment.getCollapsedReasonCode());
            x.w("unrepliable_reason");
            this.nullableStringAdapter.toJson(x, (Object)comment.getUnrepliableReason());
            x.w("author_snoovatar_img");
            this.nullableStringAdapter.toJson(x, (Object)comment.getSnoovatarImg());
            x.w("authorIconIsDefault");
            this.booleanAdapter.toJson(x, (Object)comment.getAuthorIconIsDefault());
            x.w("authorIconIsNsfw");
            this.booleanAdapter.toJson(x, (Object)comment.getAuthorIconIsNsfw());
            x.w("comment_type");
            this.nullableStringAdapter.toJson(x, (Object)comment.getCommentType());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Comment)";
    }
}
