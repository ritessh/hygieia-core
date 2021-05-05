package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGenericCollectorItem is a Querydsl query type for GenericCollectorItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGenericCollectorItem extends EntityPathBase<GenericCollectorItem> {

    private static final long serialVersionUID = -665066613L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGenericCollectorItem genericCollectorItem = new QGenericCollectorItem("genericCollectorItem");

    public final QBaseModel _super;

    public final org.bson.types.QObjectId buildId;

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorId;

    public final NumberPath<Long> creationTime = createNumber("creationTime", Long.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> processTime = createNumber("processTime", Long.class);

    public final StringPath rawData = createString("rawData");

    public final org.bson.types.QObjectId relatedCollectorItem;

    public final StringPath source = createString("source");

    public final StringPath toolName = createString("toolName");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QGenericCollectorItem(String variable) {
        this(GenericCollectorItem.class, forVariable(variable), INITS);
    }

    public QGenericCollectorItem(Path<? extends GenericCollectorItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGenericCollectorItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGenericCollectorItem(PathMetadata metadata, PathInits inits) {
        this(GenericCollectorItem.class, metadata, inits);
    }

    public QGenericCollectorItem(Class<? extends GenericCollectorItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.buildId = inits.isInitialized("buildId") ? new org.bson.types.QObjectId(forProperty("buildId")) : null;
        this.clientReference = _super.clientReference;
        this.collectorId = inits.isInitialized("collectorId") ? new org.bson.types.QObjectId(forProperty("collectorId")) : null;
        this.id = _super.id;
        this.relatedCollectorItem = inits.isInitialized("relatedCollectorItem") ? new org.bson.types.QObjectId(forProperty("relatedCollectorItem")) : null;
        this.upsertTime = _super.upsertTime;
    }

}

