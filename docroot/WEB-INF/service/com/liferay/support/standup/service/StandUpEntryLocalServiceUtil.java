/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.support.standup.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the stand up entry local service. This utility wraps {@link com.liferay.support.standup.service.impl.StandUpEntryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Daniel Javorszky
 * @see StandUpEntryLocalService
 * @see com.liferay.support.standup.service.base.StandUpEntryLocalServiceBaseImpl
 * @see com.liferay.support.standup.service.impl.StandUpEntryLocalServiceImpl
 * @generated
 */
public class StandUpEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.support.standup.service.impl.StandUpEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the stand up entry to the database. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @return the stand up entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.standup.model.StandUpEntry addStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStandUpEntry(standUpEntry);
	}

	/**
	* Creates a new stand up entry with the primary key. Does not add the stand up entry to the database.
	*
	* @param entryId the primary key for the new stand up entry
	* @return the new stand up entry
	*/
	public static com.liferay.support.standup.model.StandUpEntry createStandUpEntry(
		long entryId) {
		return getService().createStandUpEntry(entryId);
	}

	/**
	* Deletes the stand up entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the stand up entry
	* @return the stand up entry that was removed
	* @throws PortalException if a stand up entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.standup.model.StandUpEntry deleteStandUpEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStandUpEntry(entryId);
	}

	/**
	* Deletes the stand up entry from the database. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @return the stand up entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.standup.model.StandUpEntry deleteStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStandUpEntry(standUpEntry);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.liferay.support.standup.model.StandUpEntry fetchStandUpEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchStandUpEntry(entryId);
	}

	/**
	* Returns the stand up entry with the primary key.
	*
	* @param entryId the primary key of the stand up entry
	* @return the stand up entry
	* @throws PortalException if a stand up entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.standup.model.StandUpEntry getStandUpEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStandUpEntry(entryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the stand up entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of stand up entries
	* @param end the upper bound of the range of stand up entries (not inclusive)
	* @return the range of stand up entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.support.standup.model.StandUpEntry> getStandUpEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStandUpEntries(start, end);
	}

	/**
	* Returns the number of stand up entries.
	*
	* @return the number of stand up entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getStandUpEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStandUpEntriesCount();
	}

	/**
	* Updates the stand up entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @return the stand up entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.standup.model.StandUpEntry updateStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStandUpEntry(standUpEntry);
	}

	/**
	* Updates the stand up entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @param merge whether to merge the stand up entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the stand up entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.support.standup.model.StandUpEntry updateStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStandUpEntry(standUpEntry, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static StandUpEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StandUpEntryLocalService.class.getName());

			if (invokableLocalService instanceof StandUpEntryLocalService) {
				_service = (StandUpEntryLocalService)invokableLocalService;
			}
			else {
				_service = new StandUpEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(StandUpEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(StandUpEntryLocalService service) {
	}

	private static StandUpEntryLocalService _service;
}