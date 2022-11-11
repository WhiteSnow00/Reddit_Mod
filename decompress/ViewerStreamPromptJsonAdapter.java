// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/streaming/ViewerStreamPromptJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/ViewerStreamPrompt;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class ViewerStreamPromptJsonAdapter extends JsonAdapter<ViewerStreamPrompt>
{
    private volatile Constructor<ViewerStreamPrompt> constructorRef;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ViewerStreamPromptJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "prompt", "subreddit_name" });
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "prompt");
    }
    
    public ViewerStreamPrompt fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 == null) {
                        throw a.n("subredditName", "subreddit_name", jsonReader);
                    }
                    n &= 0xFFFFFFFD;
                }
                else {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("prompt", "prompt", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == -4) {
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            return new ViewerStreamPrompt((String)o, (String)o2);
        }
        Constructor<ViewerStreamPrompt> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = ViewerStreamPrompt.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "ViewerStreamPrompt::clas\u2026his.constructorRef = it }");
        }
        final ViewerStreamPrompt instance = constructorRef.newInstance(o, o2, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final ViewerStreamPrompt viewerStreamPrompt) {
        f.f((Object)x, "writer");
        if (viewerStreamPrompt != null) {
            x.h();
            x.w("prompt");
            this.stringAdapter.toJson(x, (Object)viewerStreamPrompt.getPrompt());
            x.w("subreddit_name");
            this.stringAdapter.toJson(x, (Object)viewerStreamPrompt.getSubredditName());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(ViewerStreamPrompt)";
    }
}
