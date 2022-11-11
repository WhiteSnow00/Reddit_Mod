// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import com.squareup.moshi.x;
import pg2.j;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.FlairRichTextItem;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+" }, d2 = { "Lcom/reddit/data/model/v1/CommentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/v1/Comment;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "", "booleanAdapter", "Lcom/reddit/data/model/v1/CommentListing;", "nullableCommentListingAdapter", "nullableBooleanAdapter", "", "listOfListOfStringAdapter", "Lcom/reddit/domain/model/FlairRichTextItem;", "nullableListOfFlairRichTextItemAdapter", "Lcom/reddit/domain/model/RichTextResponse;", "nullableRichTextResponseAdapter", "", "doubleAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommentJsonAdapter extends JsonAdapter<Comment>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Comment> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<List<String>>> listOfListOfStringAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<CommentListing> nullableCommentListingAdapter;
    private final JsonAdapter<List<FlairRichTextItem>> nullableListOfFlairRichTextItemAdapter;
    private final JsonAdapter<RichTextResponse> nullableRichTextResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CommentJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "parent_id", "body", "body_html", "score", "author", "author_flair_text", "author_flair_template_id", "author_flair_text_color", "author_flair_background_color", "author_cakeday", "archived", "locked", "replies", "likes", "linkTitle", "distinguished", "stickied", "subreddit", "subreddit_id", "subreddit_name_prefixed", "link_id", "score_hidden", "link_url", "saved", "isApproved", "isSpam", "isRemoved", "approved_by", "num_reports", "ignore_reports", "user_reports", "mod_reports", "author_flair_richtext", "rtjson", "authorId", "collapsed", "collapsed_because_crowd_control", "collapsed_reason", "comment_type", "created_utc", "createdUtc" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "parentId");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "score");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "authorCakeday");
        this.nullableCommentListingAdapter = (JsonAdapter<CommentListing>)y.c((Type)CommentListing.class, (Set)instance, "replies");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "likes");
        this.listOfListOfStringAdapter = (JsonAdapter<List<List<String>>>)y.c((Type)a0.d((Class)List.class, new Type[] { (Type)a0.d((Class)List.class, new Type[] { String.class }) }), (Set)instance, "userReports");
        this.nullableListOfFlairRichTextItemAdapter = (JsonAdapter<List<FlairRichTextItem>>)y.c((Type)a0.d((Class)List.class, new Type[] { FlairRichTextItem.class }), (Set)instance, "authorFlairRichText");
        this.nullableRichTextResponseAdapter = (JsonAdapter<RichTextResponse>)y.c((Type)RichTextResponse.class, (Set)instance, "rtjson");
        this.doubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.TYPE, (Set)instance, "createdUtcDouble");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
    }
    
    public Comment fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Integer value = 0;
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Integer n = value;
        Boolean b2;
        Boolean b = b2 = false;
        Boolean b4;
        Boolean b3 = b4 = b2;
        final Boolean b6;
        Boolean b5 = b6 = b4;
        Boolean b8;
        final Boolean b7 = b8 = b6;
        Boolean b10;
        Boolean b9 = b10 = b8;
        int n3;
        int n2 = n3 = -1;
        Object o = null;
        Object o2 = null;
        final String s = null;
        final String s2 = null;
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
        Double n4 = null;
        Long n5 = null;
        Boolean b11 = b10;
        Object o25 = null;
        Boolean b12 = b7;
        Boolean b13 = b6;
        Object o26 = s2;
        Object o27 = s;
        while (jsonReader.hasNext()) {
            int n6 = 0;
            Label_1732: {
                int n7 = 0;
                switch (jsonReader.F(this.options)) {
                    default: {
                        n6 = n3;
                        break Label_1732;
                    }
                    case 42: {
                        n5 = (Long)this.longAdapter.fromJson(jsonReader);
                        if (n5 != null) {
                            n6 = n3;
                            break Label_1732;
                        }
                        throw a.n("createdUtc", "createdUtc", jsonReader);
                    }
                    case 41: {
                        n4 = (Double)this.doubleAdapter.fromJson(jsonReader);
                        if (n4 != null) {
                            n6 = n3;
                            break Label_1732;
                        }
                        throw a.n("createdUtcDouble", "created_utc", jsonReader);
                    }
                    case 40: {
                        o22 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 &= 0xFFFFFEFF;
                        n6 = n3;
                        break Label_1732;
                    }
                    case 39: {
                        o21 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 &= 0xFFFFFF7F;
                        n6 = n3;
                        break Label_1732;
                    }
                    case 38: {
                        b12 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b12 != null) {
                            n2 &= 0xFFFFFFBF;
                            n6 = n3;
                            break Label_1732;
                        }
                        throw a.n("isCollapsedBecauseOfCrowdControl", "collapsed_because_crowd_control", jsonReader);
                    }
                    case 37: {
                        b13 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b13 != null) {
                            n2 &= 0xFFFFFFDF;
                            n6 = n3;
                            break Label_1732;
                        }
                        throw a.n("collapsed", "collapsed", jsonReader);
                    }
                    case 36: {
                        o20 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 &= 0xFFFFFFEF;
                        n6 = n3;
                        break Label_1732;
                    }
                    case 35: {
                        o19 = this.nullableRichTextResponseAdapter.fromJson(jsonReader);
                        n2 &= 0xFFFFFFF7;
                        n6 = n3;
                        break Label_1732;
                    }
                    case 34: {
                        o18 = this.nullableListOfFlairRichTextItemAdapter.fromJson(jsonReader);
                        n2 &= 0xFFFFFFFB;
                        n6 = n3;
                        break Label_1732;
                    }
                    case 33: {
                        o24 = this.listOfListOfStringAdapter.fromJson(jsonReader);
                        if (o24 != null) {
                            n2 &= 0xFFFFFFFD;
                            n6 = n3;
                            break Label_1732;
                        }
                        throw a.n("modReports", "mod_reports", jsonReader);
                    }
                    case 32: {
                        o23 = this.listOfListOfStringAdapter.fromJson(jsonReader);
                        if (o23 != null) {
                            n2 &= 0xFFFFFFFE;
                            n6 = n3;
                            break Label_1732;
                        }
                        throw a.n("userReports", "user_reports", jsonReader);
                    }
                    case 31: {
                        b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b5 != null) {
                            n7 = Integer.MAX_VALUE;
                            break;
                        }
                        throw a.n("ignoreReports", "ignore_reports", jsonReader);
                    }
                    case 30: {
                        n = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n != null) {
                            n7 = -1073741825;
                            break;
                        }
                        throw a.n("numReports", "num_reports", jsonReader);
                    }
                    case 29: {
                        o17 = this.nullableStringAdapter.fromJson(jsonReader);
                        n7 = -536870913;
                        break;
                    }
                    case 28: {
                        b8 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b8 != null) {
                            n7 = -268435457;
                            break;
                        }
                        throw a.n("isRemoved", "isRemoved", jsonReader);
                    }
                    case 27: {
                        b9 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b9 != null) {
                            n7 = -134217729;
                            break;
                        }
                        throw a.n("isSpam", "isSpam", jsonReader);
                    }
                    case 26: {
                        b10 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b10 != null) {
                            n7 = -67108865;
                            break;
                        }
                        throw a.n("isApproved", "isApproved", jsonReader);
                    }
                    case 25: {
                        b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b4 != null) {
                            n3 &= 0xFDFFFFFF;
                            continue;
                        }
                        throw a.n("saved", "saved", jsonReader);
                    }
                    case 24: {
                        o16 = this.nullableStringAdapter.fromJson(jsonReader);
                        n7 = -16777217;
                        break;
                    }
                    case 23: {
                        b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b3 != null) {
                            n7 = -8388609;
                            break;
                        }
                        throw a.n("isScoreHidden", "score_hidden", jsonReader);
                    }
                    case 22: {
                        o2 = this.stringAdapter.fromJson(jsonReader);
                        if (o2 != null) {
                            n7 = -4194305;
                            break;
                        }
                        throw a.n("linkId", "link_id", jsonReader);
                    }
                    case 21: {
                        o15 = this.nullableStringAdapter.fromJson(jsonReader);
                        n7 = -2097153;
                        break;
                    }
                    case 20: {
                        o27 = this.stringAdapter.fromJson(jsonReader);
                        if (o27 != null) {
                            n7 = -1048577;
                            break;
                        }
                        throw a.n("subredditId", "subreddit_id", jsonReader);
                    }
                    case 19: {
                        o26 = this.stringAdapter.fromJson(jsonReader);
                        if (o26 != null) {
                            n7 = -524289;
                            break;
                        }
                        throw a.n("subreddit", "subreddit", jsonReader);
                    }
                    case 18: {
                        b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b2 != null) {
                            n7 = -262145;
                            break;
                        }
                        throw a.n("isStickied", "stickied", jsonReader);
                    }
                    case 17: {
                        o14 = this.nullableStringAdapter.fromJson(jsonReader);
                        n7 = -131073;
                        break;
                    }
                    case 16: {
                        o13 = this.nullableStringAdapter.fromJson(jsonReader);
                        n7 = -65537;
                        break;
                    }
                    case 15: {
                        o12 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n7 = -32769;
                        break;
                    }
                    case 14: {
                        o11 = this.nullableCommentListingAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFBFFF);
                        break Label_1732;
                    }
                    case 13: {
                        b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b != null) {
                            n6 = (n3 & 0xFFFFDFFF);
                            break Label_1732;
                        }
                        throw a.n("isLocked", "locked", jsonReader);
                    }
                    case 12: {
                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (false != null) {
                            n6 = (n3 & 0xFFFFEFFF);
                            break Label_1732;
                        }
                        throw a.n("isArchived", "archived", jsonReader);
                    }
                    case 11: {
                        b11 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b11 != null) {
                            n6 = (n3 & 0xFFFFF7FF);
                            break Label_1732;
                        }
                        throw a.n("authorCakeday", "author_cakeday", jsonReader);
                    }
                    case 10: {
                        o10 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFBFF);
                        break Label_1732;
                    }
                    case 9: {
                        o9 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFDFF);
                        break Label_1732;
                    }
                    case 8: {
                        o8 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFEFF);
                        break Label_1732;
                    }
                    case 7: {
                        o7 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFF7F);
                        break Label_1732;
                    }
                    case 6: {
                        o6 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFFBF);
                        break Label_1732;
                    }
                    case 5: {
                        value = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (value != null) {
                            n6 = (n3 & 0xFFFFFFDF);
                            break Label_1732;
                        }
                        throw a.n("score", "score", jsonReader);
                    }
                    case 4: {
                        o5 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFFEF);
                        break Label_1732;
                    }
                    case 3: {
                        o4 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFFF7);
                        break Label_1732;
                    }
                    case 2: {
                        o3 = this.nullableStringAdapter.fromJson(jsonReader);
                        n6 = (n3 & 0xFFFFFFFB);
                        break Label_1732;
                    }
                    case 1: {
                        o25 = this.stringAdapter.fromJson(jsonReader);
                        if (o25 != null) {
                            n6 = (n3 & 0xFFFFFFFD);
                            break Label_1732;
                        }
                        throw a.n("name", "name", jsonReader);
                    }
                    case 0: {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            n6 = (n3 & 0xFFFFFFFE);
                            break Label_1732;
                        }
                        throw a.n("id", "id", jsonReader);
                    }
                    case -1: {
                        jsonReader.J();
                        jsonReader.z1();
                        n6 = n3;
                        break Label_1732;
                    }
                }
                n6 = (n3 & n7);
            }
            n3 = n6;
        }
        jsonReader.r();
        Comment comment;
        if (n3 == 0 && n2 == -512) {
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            f.d(o25, "null cannot be cast to non-null type kotlin.String");
            final int intValue = value;
            final boolean booleanValue = b11;
            final boolean booleanValue2 = false;
            final boolean booleanValue3 = b;
            final boolean booleanValue4 = b2;
            f.d(o26, "null cannot be cast to non-null type kotlin.String");
            f.d(o27, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue5 = b3;
            final boolean booleanValue6 = b4;
            final boolean booleanValue7 = b10;
            final boolean booleanValue8 = b9;
            final boolean booleanValue9 = b8;
            final int intValue2 = n;
            final boolean booleanValue10 = b5;
            f.d(o23, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.String>>");
            f.d(o24, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.String>>");
            comment = new Comment((String)o, (String)o25, (String)o3, (String)o4, (String)o5, intValue, (String)o6, (String)o7, (String)o8, (String)o9, (String)o10, booleanValue, booleanValue2, booleanValue3, (CommentListing)o11, (Boolean)o12, (String)o13, (String)o14, booleanValue4, (String)o26, (String)o27, (String)o15, (String)o2, booleanValue5, (String)o16, booleanValue6, booleanValue7, booleanValue8, booleanValue9, (String)o17, intValue2, booleanValue10, (List<? extends List<String>>)o23, (List<? extends List<String>>)o24, (List<FlairRichTextItem>)o18, (RichTextResponse)o19, (String)o20, b13, b12, (String)o21, (String)o22);
        }
        else {
            Constructor<Comment> constructorRef = this.constructorRef;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                constructorRef = Comment.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, type, String.class, String.class, String.class, String.class, String.class, type2, type2, type2, CommentListing.class, Boolean.class, String.class, String.class, type2, String.class, String.class, String.class, String.class, type2, String.class, type2, type2, type2, type2, String.class, type, type2, List.class, List.class, List.class, RichTextResponse.class, String.class, type2, type2, String.class, String.class, type, type, a.c);
                this.constructorRef = constructorRef;
                final j a = j.a;
                f.e((Object)constructorRef, "Comment::class.java.getD\u2026his.constructorRef = it }");
            }
            final Comment instance = constructorRef.newInstance(o, o25, o3, o4, o5, value, o6, o7, o8, o9, o10, b11, false, b, o11, o12, o13, o14, b2, o26, o27, o15, o2, b3, o16, b4, b10, b9, b8, o17, n, b5, o23, o24, o18, o19, o20, b13, b12, o21, o22, n3, n2, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            comment = instance;
        }
        double createdUtcDouble;
        if (n4 != null) {
            createdUtcDouble = n4;
        }
        else {
            createdUtcDouble = comment.getCreatedUtcDouble();
        }
        comment.setCreatedUtcDouble(createdUtcDouble);
        long createdUtc;
        if (n5 != null) {
            createdUtc = n5;
        }
        else {
            createdUtc = comment.getCreatedUtc();
        }
        comment.setCreatedUtc(createdUtc);
        return comment;
    }
    
    public void toJson(final x x, final Comment comment) {
        f.f((Object)x, "writer");
        if (comment != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)comment.getId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)comment.getName());
            x.w("parent_id");
            this.nullableStringAdapter.toJson(x, (Object)comment.getParentId());
            x.w("body");
            this.nullableStringAdapter.toJson(x, (Object)comment.getBody());
            x.w("body_html");
            this.nullableStringAdapter.toJson(x, (Object)comment.getBodyHtml());
            x.w("score");
            this.intAdapter.toJson(x, (Object)comment.getScore());
            x.w("author");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthor());
            x.w("author_flair_text");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairText());
            x.w("author_flair_template_id");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairTemplateId());
            x.w("author_flair_text_color");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairTextColor());
            x.w("author_flair_background_color");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorFlairBackgroundColor());
            x.w("author_cakeday");
            this.booleanAdapter.toJson(x, (Object)comment.getAuthorCakeday());
            x.w("archived");
            this.booleanAdapter.toJson(x, (Object)comment.isArchived());
            x.w("locked");
            this.booleanAdapter.toJson(x, (Object)comment.isLocked());
            x.w("replies");
            this.nullableCommentListingAdapter.toJson(x, (Object)comment.getReplies$temp_release());
            x.w("likes");
            this.nullableBooleanAdapter.toJson(x, (Object)comment.getLikes());
            x.w("linkTitle");
            this.nullableStringAdapter.toJson(x, (Object)comment.getLinkTitle());
            x.w("distinguished");
            this.nullableStringAdapter.toJson(x, (Object)comment.getDistinguished());
            x.w("stickied");
            this.booleanAdapter.toJson(x, (Object)comment.isStickied());
            x.w("subreddit");
            this.stringAdapter.toJson(x, (Object)comment.getSubreddit());
            x.w("subreddit_id");
            this.stringAdapter.toJson(x, (Object)comment.getSubredditId());
            x.w("subreddit_name_prefixed");
            this.nullableStringAdapter.toJson(x, (Object)comment.getSubredditNamePrefixed());
            x.w("link_id");
            this.stringAdapter.toJson(x, (Object)comment.getLinkId());
            x.w("score_hidden");
            this.booleanAdapter.toJson(x, (Object)comment.isScoreHidden());
            x.w("link_url");
            this.nullableStringAdapter.toJson(x, (Object)comment.getLinkUrl());
            x.w("saved");
            this.booleanAdapter.toJson(x, (Object)comment.getSaved());
            x.w("isApproved");
            this.booleanAdapter.toJson(x, (Object)comment.isApproved());
            x.w("isSpam");
            this.booleanAdapter.toJson(x, (Object)comment.isSpam());
            x.w("isRemoved");
            this.booleanAdapter.toJson(x, (Object)comment.isRemoved());
            x.w("approved_by");
            this.nullableStringAdapter.toJson(x, (Object)comment.getApprovedBy());
            x.w("num_reports");
            this.intAdapter.toJson(x, (Object)comment.getNumReports());
            x.w("ignore_reports");
            this.booleanAdapter.toJson(x, (Object)comment.getIgnoreReports());
            x.w("user_reports");
            this.listOfListOfStringAdapter.toJson(x, (Object)comment.getUserReports());
            x.w("mod_reports");
            this.listOfListOfStringAdapter.toJson(x, (Object)comment.getModReports());
            x.w("author_flair_richtext");
            this.nullableListOfFlairRichTextItemAdapter.toJson(x, (Object)comment.getAuthorFlairRichText());
            x.w("rtjson");
            this.nullableRichTextResponseAdapter.toJson(x, (Object)comment.getRtjson());
            x.w("authorId");
            this.nullableStringAdapter.toJson(x, (Object)comment.getAuthorId());
            x.w("collapsed");
            this.booleanAdapter.toJson(x, (Object)comment.getCollapsed());
            x.w("collapsed_because_crowd_control");
            this.booleanAdapter.toJson(x, (Object)comment.isCollapsedBecauseOfCrowdControl());
            x.w("collapsed_reason");
            this.nullableStringAdapter.toJson(x, (Object)comment.getCollapsedReason());
            x.w("comment_type");
            this.nullableStringAdapter.toJson(x, (Object)comment.getCommentType());
            x.w("created_utc");
            this.doubleAdapter.toJson(x, (Object)comment.getCreatedUtcDouble());
            x.w("createdUtc");
            this.longAdapter.toJson(x, (Object)comment.getCreatedUtc());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Comment)";
    }
}
