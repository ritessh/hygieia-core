package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCollector is a Querydsl query type for Collector
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCollector extends EntityPathBase<Collector> {

    private static final long serialVersionUID = 953199339L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCollector collector = new QCollector("collector");

    public final QBaseModel _super;

    public final MapPath<String, Object, SimplePath<Object>> allFields = this.<String, Object, SimplePath<Object>>createMap("allFields", String.class, Object.class, SimplePath.class);

    //inherited
    public final StringPath clientReference;

    public final EnumPath<CollectorType> collectorType = createEnum("collectorType", CollectorType.class);

    public final BooleanPath enabled = createBoolean("enabled");

    public final ListPath<CollectionError, QCollectionError> errors = this.<CollectionError, QCollectionError>createList("errors", CollectionError.class, QCollectionError.class, PathInits.DIRECT2);

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Long> lastExecuted = createNumber("lastExecuted", Long.class);

    public final NumberPath<Long> lastExecutedSeconds = createNumber("lastExecutedSeconds", Long.class);

    public final DateTimePath<java.util.Date> lastExecutedTime = createDateTime("lastExecutedTime", java.util.Date.class);

    public final NumberPath<Long> lastExecutionRecordCount = createNumber("lastExecutionRecordCount", Long.class);

    public final StringPath name = createString("name");

    public final BooleanPath online = createBoolean("online");

    public final MapPath<String, Object, SimplePath<Object>> properties = this.<String, Object, SimplePath<Object>>createMap("properties", String.class, Object.class, SimplePath.class);

    public final ListPath<String, StringPath> searchFields = this.<String, StringPath>createList("searchFields", String.class, StringPath.class, PathInits.DIRECT2);

    public final MapPath<String, Object, SimplePath<Object>> uniqueFields = this.<String, Object, SimplePath<Object>>createMap("uniqueFields", String.class, Object.class, SimplePath.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QCollector(String variable) {
        this(Collector.class, forVariable(variable), INITS);
    }

    public QCollector(Path<? extends Collector> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCollector(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCollector(PathMetadata metadata, PathInits inits) {
        this(Collector.class, metadata, inits);
    }

    public QCollector(Class<? extends Collector> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

