package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFortifyScanReport_Threat is a Querydsl query type for Threat
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QFortifyScanReport_Threat extends BeanPath<FortifyScanReport.Threat> {

    private static final long serialVersionUID = 388364360L;

    public static final QFortifyScanReport_Threat threat = new QFortifyScanReport_Threat("threat");

    public final ListPath<String, StringPath> components = this.<String, StringPath>createList("components", String.class, StringPath.class, PathInits.DIRECT2);

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public QFortifyScanReport_Threat(String variable) {
        super(FortifyScanReport.Threat.class, forVariable(variable));
    }

    public QFortifyScanReport_Threat(Path<? extends FortifyScanReport.Threat> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFortifyScanReport_Threat(PathMetadata metadata) {
        super(FortifyScanReport.Threat.class, metadata);
    }

}

