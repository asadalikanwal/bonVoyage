package com.bonvoyage.domain;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/** Class to hold Id document data.
 * 
 * @author Aser Ahmad
 * @author aaahmad@mum.edu
 * @version 1.0
 * @since 1.0
 *
 */
@Entity
public class IdDocument {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Id_Document_Id")
private Long Id;

@Column(name="Document_Type")
@NotNull(message="{NotNull}")
private IdDocumentType documentType;

@Column(name="Document_No")
@NotNull(message="{NotNull}")
private String documentNo;

@Column(name="Valid_Through")
@NotNull(message="{NotNull}")
@DateTimeFormat(pattern="MM/DD/YYYY")
@Future(message="{Date.future}")
private LocalDate validThrough;

    @Transient
private MultipartFile documentImage;


}
