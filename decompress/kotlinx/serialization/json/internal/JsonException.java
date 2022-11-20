// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json.internal;

import ng2.e;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lkotlinx/serialization/json/internal/JsonException;", "Lkotlinx/serialization/SerializationException;", "message", "", "(Ljava/lang/String;)V", "kotlinx-serialization-json" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public class JsonException extends SerializationException
{
    public JsonException(final String s) {
        e.f((Object)s, "message");
        super(s);
    }
}
