package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLabels is a Querydsl query type for Labels
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QLabels extends BeanPath<Labels> {

    private static final long serialVersionUID = 1335971425L;

    public static final QLabels labels = new QLabels("labels");

    public final StringPath labelKey = createString("labelKey");

    public final StringPath labelValue = createString("labelValue");

    public QLabels(String variable) {
        super(Labels.class, forVariable(variable));
    }

    public QLabels(Path<? extends Labels> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLabels(PathMetadata metadata) {
        super(Labels.class, metadata);
    }

}

