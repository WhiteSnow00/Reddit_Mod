// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal.util;

public class IntHashMap
{
    private int count;
    private float loadFactor;
    private Entry[] table;
    private int threshold;
    
    public IntHashMap() {
        this(20, 0.75f);
    }
    
    public IntHashMap(final int n) {
        this(n, 0.75f);
    }
    
    public IntHashMap(final int n, final float loadFactor) {
        if (n < 0) {
            throw new IllegalArgumentException(d.h("Illegal Capacity: ", n));
        }
        if (loadFactor > 0.0f) {
            int n2;
            if ((n2 = n) == 0) {
                n2 = 1;
            }
            this.loadFactor = loadFactor;
            this.table = new Entry[n2];
            this.threshold = (int)(n2 * loadFactor);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal Load: ");
        sb.append(loadFactor);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void clear() {
        synchronized (this) {
            final Entry[] table = this.table;
            int length = table.length;
            while (--length >= 0) {
                table[length] = null;
            }
            this.count = 0;
        }
    }
    
    public boolean contains(final Object o) {
        o.getClass();
        final Entry[] table = this.table;
        int length = table.length;
        while (true) {
            final int n = length - 1;
            if (length <= 0) {
                return false;
            }
            for (Entry next = table[n]; next != null; next = next.next) {
                if (next.value.equals(o)) {
                    return true;
                }
            }
            length = n;
        }
    }
    
    public boolean containsKey(final int n) {
        final Entry[] table = this.table;
        for (Entry next = table[(Integer.MAX_VALUE & n) % table.length]; next != null; next = next.next) {
            if (next.hash == n) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsValue(final Object o) {
        return this.contains(o);
    }
    
    public Object get(final int n) {
        final Entry[] table = this.table;
        for (Entry next = table[(Integer.MAX_VALUE & n) % table.length]; next != null; next = next.next) {
            if (next.hash == n) {
                return next.value;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return this.count == 0;
    }
    
    public Object put(final int n, final Object value) {
        final Entry[] table = this.table;
        final int n2 = Integer.MAX_VALUE & n;
        int n3 = n2 % table.length;
        for (Entry next = table[n3]; next != null; next = next.next) {
            if (next.hash == n) {
                final Object value2 = next.value;
                next.value = value;
                return value2;
            }
        }
        Entry[] table2 = table;
        if (this.count >= this.threshold) {
            this.rehash();
            table2 = this.table;
            n3 = n2 % table2.length;
        }
        table2[n3] = new Entry(n, n, value, table2[n3]);
        ++this.count;
        return null;
    }
    
    public void rehash() {
        final Entry[] table = this.table;
        int length = table.length;
        final int n = length * 2 + 1;
        final Entry[] table2 = new Entry[n];
        this.threshold = (int)(n * this.loadFactor);
        this.table = table2;
        while (true) {
            final int n2 = length - 1;
            if (length <= 0) {
                break;
            }
            Entry next;
            for (Entry entry = table[n2]; entry != null; entry = next) {
                next = entry.next;
                final int n3 = (entry.hash & Integer.MAX_VALUE) % n;
                entry.next = table2[n3];
                table2[n3] = entry;
            }
            length = n2;
        }
    }
    
    public Object remove(final int n) {
        final Entry[] table = this.table;
        final int n2 = (Integer.MAX_VALUE & n) % table.length;
        Entry entry = table[n2];
        Entry entry2 = null;
        while (entry != null) {
            if (entry.hash == n) {
                if (entry2 != null) {
                    entry2.next = entry.next;
                }
                else {
                    table[n2] = entry.next;
                }
                --this.count;
                final Object value = entry.value;
                entry.value = null;
                return value;
            }
            final Entry next = entry.next;
            entry2 = entry;
            entry = next;
        }
        return null;
    }
    
    public int size() {
        return this.count;
    }
    
    public static class Entry
    {
        public final int hash;
        public int key;
        public Entry next;
        public Object value;
        
        public Entry(final int hash, final int key, final Object value, final Entry next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
