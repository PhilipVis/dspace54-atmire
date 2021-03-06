package com.atmire.objectmanager;

import org.dspace.content.Item;
import org.dspace.content.Metadatum;
import org.dspace.core.Context;

import java.util.List;

/**
 * Class that will enrich the metadata of an item
 */
public interface MetaDatumEnricher {

    void enrichMetadata(final Context context, final Item item, final List<Metadatum> metadataList);

}