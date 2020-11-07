/*
 * (C) Copyright IBM Corp. 2017, 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.visual_recognition.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.List;

/** Results for one image. */
public class ClassifiedImage extends GenericModel {

  @SerializedName("source_url")
  protected String sourceUrl;

  @SerializedName("resolved_url")
  protected String resolvedUrl;

  protected String image;
  protected ErrorInfo error;
  protected List<ClassifierResult> classifiers;

  /**
   * Gets the sourceUrl.
   *
   * <p>Source of the image before any redirects. Not returned when the image is uploaded.
   *
   * @return the sourceUrl
   */
  public String getSourceUrl() {
    return sourceUrl;
  }

  /**
   * Gets the resolvedUrl.
   *
   * <p>Fully resolved URL of the image after redirects are followed. Not returned when the image is
   * uploaded.
   *
   * @return the resolvedUrl
   */
  public String getResolvedUrl() {
    return resolvedUrl;
  }

  /**
   * Gets the image.
   *
   * <p>Relative path of the image file if uploaded directly. Not returned when the image is passed
   * by URL.
   *
   * @return the image
   */
  public String getImage() {
    return image;
  }

  /**
   * Gets the error.
   *
   * <p>Information about what might have caused a failure, such as an image that is too large. Not
   * returned when there is no error.
   *
   * @return the error
   */
  public ErrorInfo getError() {
    return error;
  }

  /**
   * Gets the classifiers.
   *
   * <p>The classifiers.
   *
   * @return the classifiers
   */
  public List<ClassifierResult> getClassifiers() {
    return classifiers;
  }
}
