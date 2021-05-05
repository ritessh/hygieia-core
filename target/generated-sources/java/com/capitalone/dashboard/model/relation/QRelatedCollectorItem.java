package com.capitalone.dashboard.model.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRelatedCollectorItem is a Querydsl query type for RelatedCollectorItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRelatedCollectorItem extends EntityPathBase<RelatedCollectorItem> {

    private static final long serialVersionUID = 57728805L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRelatedCollectorItem relatedCollectorItem = new QRelatedCollectorItem("relatedCollectorItem");

    public final com.capitalone.dashboard.model.QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Long> creationTime = createNumber("creationTime", Long.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final org.bson.types.QObjectId left;

    public final StringPath reason = createString("reason");

    public final org.bson.types.QObjectId right;

    public final StringPath source = createString("source");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QRelatedCollectorItem(String variable) {
        this(RelatedCollectorItem.class, forVariable(variable), INITS);
    }

    public QRelatedCollectorItem(Path<? extends RelatedCollectorItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRelatedCollectorItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRelatedCollectorItem(PathMetadata metadata, PathInits inits) {
        this(RelatedCollectorItem.class, metadata, inits);
    }

    public QRelatedCollectorItem(Class<? extends RelatedCollectorItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.capitalone.dashboard.model.QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.left = inits.isInitialized("left") ? new org.bson.types.QObjectId(forProperty("left")) : null;
        this.right = inits.isInitialized("right") ? new org.bson.types.QObjectId(forProperty("right")) : null;
        this.upsertTime = _super.upsertTime;
    }

}

