package org.picketlink.idm;

import java.io.Serializable;
import java.util.List;

import org.picketlink.idm.permission.Permission;

/**
 * Manages all Permission Management related operations.
 *
 * @author Shane Bryzak
 */
public interface PermissionManager {
    /**
     * Return a list of all permissions for the specified resource.
     *
     * @param resource
     * @return
     */
    List<Permission> listPermissions(Object resource);

    /**
     * Returns a list of all Permissions for the specified resource identifier
     *
     * @param resourceClass
     * @param identifier
     * @return
     */
    List<Permission> listPermissions(Class<?> resourceClass, Serializable identifier);

    /**
     * Return a list of all permissions for the specified resource, with the specified operation
     *
     * @param resource
     * @param permission
     * @return
     */
    List<Permission> listPermissions(Object resource, String operation);

    /**
     * Returns a list of all Permissions for the specified resource identifier, with the specified operation
     *
     * @param resourceClass
     * @param identifier
     * @param operation
     * @return
     */
    List<Permission> listPermissions(Class<?> resourceClass, Serializable identifier, String operation);

    /**
     * Grant the specified permission
     * @param permission
     *
     * @return boolean returns true if the permission was granted successfully
     */
    void grantPermission(Permission permission);

    /**
     * Grant all permissions in the specified list
     *
     * @param permissions
     * @return boolean returns true if the permissions were granted successfully
     */
    void grantPermissions(List<Permission> permissions);

    /**
     * Revoke the specified permission
     *
     * @param permission
     * @return
     */
    void revokePermission(Permission permission);

    /**
     * Revoke the specified permissions
     *
     * @param permissions
     * @return
     */
    void revokePermissions(List<Permission> permissions);

    /**
     * Remove all permissions for the specified resource
     *
     * @param resource
     */
    void clearPermissions(Object resource);

    /**
     * List all allowed permission type strings for the specified resource
     *
     * @param resource
     * @return
     */
    List<String> listOperations(Class<?> resourceClass);
}
