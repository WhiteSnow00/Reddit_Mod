// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import android.content.Context;

public final class g
{
    public static <T extends RoomDatabase> RoomDatabase.a<T> a(final Context context, final Class<T> clazz, final String s) {
        if (s != null && s.trim().length() != 0) {
            return (RoomDatabase.a<T>)new RoomDatabase.a(context, (Class<RoomDatabase>)clazz, s);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
