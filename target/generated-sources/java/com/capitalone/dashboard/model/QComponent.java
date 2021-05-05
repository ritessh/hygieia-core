package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComponent is a Querydsl query type for Component
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QComponent extends EntityPathBase<Component> {

    private static final long serialVersionUID = 1964768091L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComponent component = new QComponent("component");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final MapPath<CollectorType, java.util.List<CollectorItem>, SimplePath<java.util.List<CollectorItem>>> collectorItems = this.<CollectorType, java.util.List<CollectorItem>, SimplePath<java.util.List<CollectorItem>>>createMap("collectorItems", CollectorType.class, java.util.List.class, SimplePath.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath name = createString("name");

    public final StringPath owner = createString("owner");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QComponent(String variable) {
        this(Component.class, forVariable(variable), INITS);
    }

    public QComponent(Path<? extends Component> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComponent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComponent(PathMetadata metadata, PathInits inits) {
        this(Component.class, metadata, inits);
    }

    public QComponent(Class<? extends Component> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

