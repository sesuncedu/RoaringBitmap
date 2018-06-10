package org.roaringbitmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ObjectSizerTest {

    @Test public void testCompressedOopsPaddedSize() {
        ObjectSizer os = ObjectSizers.HOTSPOT_COMPRESSED_OOPS;
        assertEquals("paddedSize(12)",16,os.getPaddedSize(12));
        assertEquals("paddedSize(16)",16,os.getPaddedSize(12));
        assertEquals("paddedSize(17)",24,os.getPaddedSize(17));
    }

}
